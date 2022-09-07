### Spring 装配
#### Spring framework 手动装配
1. Spring 模式注解装配
    * 定义：一种声明在应用中，用来扮演组件角色的注解
    * @Component,@Service,@Controller,@Repository,@Configuration等
    * 装配<context:componetScan> 或@ComponentScan
    * 模式注解的特性`RepositoryBootStrap`
      1. 派生性 `FirstLevelRepository`
      2. 层次性 `SecondLevelRepository`
2. Spring @Enable 模块儿
   1. 定义：具有相同领域的功能组件集合，组合形成的一个独立的单元。
   2. 举例： @EnableWebMvc,@EnableAutoConfiguration
   3. 实现方式：
      1. 注解方式，`EnableHelloWorld,HelloWorldBootStrap`
      2. 编程方式 `EnableHelloWorldSelector,EnableHelloWorldSelectorBootStrap`
3. 条件装配 
   1. 定义： Bean 装配的前置判断
   2. 举例： @Profile， @Conditional
   3. 实现方式： 
      1. 注解方式
         * @Profile
           1. `ProfileJava7CalculateService,ProfileJava8CalculateService,ProfileCalculateBootStrap,ProfileCalculateBootStrap`

      2. 编程方式 
         1. @Conditional
            1. `ConditionalOnSystemProperties,ConditionalCalculateBootStrap，OnSystemPropertiesCondition，ConditionalCalculateService ，ConditionalJava7CalculateService，ConditionalJava8CalculateService`
         
#### Spring boot 自动装配
1. 定义: 基于约定大于配置的原则，实现spring 组件自动装配的目的
2. 装配: 模式注解，@Enable模块儿，条件装配，工厂加载机制
   1. 工厂加载机制
      1. 实现类：SpringFactoriesLoader 
      2. 配置资源：META-INF/spring.factories
3. 实现：
   1. 激活自动装配
      1. @EnableAutoConfiguration `EnableAutoConfigurationBootStrap`
   2. 实现自动装配
      1. XXXXAutoConfiguration `HelloWorldAutoConfiguration`
   3. 配置自动装配
      1. META-INF/spring.factories
