### Spring Application
#### SpringApplication
1. 定义： spring 应用的引导类，提供便利的自定以行为方法
2. 应用场景： 嵌入式web应用和非web应用。 （普通的web 应用不能用这种方式启动，因为启动类都是在容器的中）
3. SpringApplication的基本使用
   1. SpringApplication的运行 `SpringApplicaiton.run(XXXX.class, args);`
   2. 自定义SpringApplication
      1. 通过SpringApplication Api调整
      ``` java
      SpringApplication applicaiton = new SpringApplication(XXXXX.class);
      application.setBannerMode(Mode.CONSOLE);
      application.setApplicaitonType(WebApplicationType.NONE);
      applicatino.setAddtionalProfile("prod");
      application.setHeadLess(true);
      ```
      2. 通过SpingApplicationBuilder API 进行调整
      ``` java 
      new SpringApplicationBuider(XXXXX.class)
      .bannerMode(Mode.CONSOLE)
      .web(WebApplicationType.NONE)
      .profiles("prod")
      .headless(true)
      .run(args)
      
      ```
4. SpringAppliation 的加载顺序
   1. 初始化阶段
      1. 配置：Spring Bean 的来源
         1. java 配置类或者配置文件（xml）的集合，由于Spring Boot `BeanDefinitionLoader` 读取，并且将配置源解析加载为 Spring Bean定义
            1. java 配置class
               1. 由于Spring注解驱动中的java配置类，大多数是spring的模式注解锁哦标注的类如 @Configuration
            2. XML 上下文配置文件
               1. 用于Spring传统配置驱动中的xml文件
         2. 数量： 一个或者多个以上
      2. 推断： 应用类型和主引导类 （MainClass）
         1. 推断web应用类型
            1. 根据当前ClassPath中是否存在相关的实现类来判断web应用的类型，包括
               1. Web React： WebApplicationType.REACTIVE
               2. Web Servlet: WebApplicationType.SERVLET
               3. 非Web ： WebApplicationType.NONE
            2. 参考方法： `SpringApplication#deduceWebApplcationType`
         2. 推断引导类：通过一场调用栈的方式推断引导类
      3. 加载： 应用上下文初始器 应用事件监听器
         1. 加载应用上下文初始器`ApplcationContextInitializer`
            1. 利用Spring工厂加载机制，实例化`ApplicationContextInitializer`实现类，并排序对象集合
               1. 参考`HelloWorldContextInitializer,AfterHelloWorldContextInitializer`
            2. 实现类：SpringFactoryLoader
            3. 配置资源：META-INF/spring.factories
            4. 排序：AnnotationAwareOrderComparator#sort
               1. 参考`HelloWorldContextInitializer,AfterHelloWorldContextInitializer`
         2. 应用事件监听器：
            1. 实现接口ApplicationListener 参考demo`AfterHelloWorldApplicationListener,HelloWorldApplicationListener`
   2. 运行阶段
      1. 加载： SpringApplication 运行监听器
         1. 加载SpringApplication运行监听器：（SpringApplicationRunListeners）
            1. 利用Spring工厂加载机制，读取SpringApplicationRunListener对象的集合，并封装到组合类SpringApplicationRunListeners
         
      2. 运行： SpringApplication 监听器
         1. 运行SpringApplication运行监听器：SpringApplicationRunListeners,监听多个运行状态方法
            1. starting() Spring应用刚启动
            2. environmentPrepared(ConfigurableEnvironment)
            3. contextPrepared(ConfigurableApplicationContext)
            4. contextLoaded(ConfigurableApplicationContext)
            5. started(ConfigurableApplicationContext)
            6. running(ConfigurableApplicationContext)
            7. failed(ConfigurableApplicationContext)
      3. 监听：SpringBoot 事件， Spring 事件 
         1. SpringBoot 通过SpringApplicationRunListener的实现类，EventPublishingListener利用springFramework的api，广播springboot事件
            * 参考例子`HelloWorldSpringApplicationRunListener` ,需要注意的是，需要重写构造函数
         2. SpringFramework事件监听器模型
            1. Spring应用事件
               1. 普通引用事件：ApplicationEvent
               2. 应用上下文事件：ApplicationContextEvent
            2. Spring 应用监听器
               1. 接口编程模型：ApplicationListener ` 使用SpringFramework的方式加载listenerSpringApplicationEventBootStrap`
               2. 注解编程模型：@EventListener
            3. Spring应用广播器
               1. 接口：ApplicationEventMulticaster
               2. 实现类：SimpleApplicationEventMulticaster
                  1. 执行模式分为同步和异步
      4. 创建：应用上下文，Environment,其他
         1. 创建ApplicationContext `SpringApplicationContextBootStrap`
            1. 根据准备阶段的推断Web应用类型创建对应的ConfigurableApplicationContext实例
               1. WebReactive：AnnotationConfigReactiveWebServerApplicationContext
               2. WebServlet：AnnotationConfigServletWebServerApplicationContext
               3. 非Web：AnnotationConfigApplicationContext
         2. 创建Environment `SpringApplicationContextBootStrap`
            1. 根据准备阶段的推断web应用类型对应的ConfigurableEnvironment
               1. Web Reactive:StandardEnvironment
               2. Web Servlet: StandardServletEnvironment
               3. 非Web : StandardEnvironment
      5. 失败：故障分析报告
      6. 回调：CommandLineRunner，ApplicationRunner
   3. SpringListener 的运行机制
      1. SpringApplication 初始化阶段注册 SpringApplicationRunnerLister 到 SpringApplicationRunnerListeners 中
      2. 在SpringApplication执行run方法， 在spring 工程运行的不同阶段，回调SpringApplicationRunners的不同阶段的方法并 通过context.publishEvent
方法派发事件， 回掉注册在ApplicationListener的 所有实现类。
