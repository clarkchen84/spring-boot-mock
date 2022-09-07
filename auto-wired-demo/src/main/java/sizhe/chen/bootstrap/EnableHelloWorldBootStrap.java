package sizhe.chen.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import sizhe.chen.annotation.EnableHelloWorld;

/**
 * EnableHelloWorldBootStrap
 *
 * @Author chensizhe
 * @Date 2022/9/6 10:33 AM
 */
@EnableHelloWorld
public class EnableHelloWorldBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new  SpringApplicationBuilder(EnableHelloWorldBootStrap.class)
                .web(WebApplicationType.NONE).run(args);

        System.out.println(context.getBean("helloWorld"));
        context.close();
    }
}
