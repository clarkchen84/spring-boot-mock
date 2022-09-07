package sizhe.chen.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import sizhe.chen.annotation.EnableHelloWorldSelector;

/**
 * EnableHelloWorldSelectorBootStrap
 *
 * @Author chensizhe
 * @Date 2022/9/6 11:18 AM
 */
@EnableHelloWorldSelector
public class EnableHelloWorldSelectorBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldSelectorBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        System.out.println(context.getBean("importSelector"));

        context.close();
    }
}
