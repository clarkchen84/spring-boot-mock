package sizhe.chen.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * spring 应用上下文引导类
 *
 * @Author chensizhe
 * @Date 2022/9/10 10:18 PM
 */
@SpringBootApplication
public class SpringApplicationContextBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringApplicationContextBootStrap.class)
                //.web(WebApplicationType.NONE)
                .run(args);

        System.out.println("context class type: " + context.getClass().getName());

        System.out.println("environment class type: " + context.getEnvironment().getClass().getName());
        context.close();
    }
}
