package sizhe.chen.bootstrap;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring 应用事件引导类
 *
 * @Author chensizhe
 * @Date 2022/9/9 2:02 PM
 */
public class SpringApplicationEventBootStrap {

    public static void main(String[] args) {
        //创建上下文
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext();
        //注册上下文事件
        context.addApplicationListener(event -> {
            System.out.println("监听到事件：" + event );
        });

        //启动上下文
        context.refresh();
        // 发送事件

        context.publishEvent("event:" +
                " customersized ");
        // 关闭上下文
        context.close();
    }
}
