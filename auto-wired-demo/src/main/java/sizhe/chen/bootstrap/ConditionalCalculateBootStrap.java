package sizhe.chen.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import sizhe.chen.service.ConditionalCalculateService;
import sizhe.chen.service.ProfileCalculateService;

/**
 * ProfileCalculateBootStrap
 *
 * @Author chensizhe
 * @Date 2022/9/6 5:05 PM
 */
@SpringBootApplication(scanBasePackages = "sizhe.chen.service")
public class ConditionalCalculateBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalCalculateBootStrap.class)
                .web(WebApplicationType.NONE)
               // .profiles("JAVA7")
                .run(args);

        ConditionalCalculateService service = context.getBean(ConditionalCalculateService.class);
        System.out.println(service.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        context.close();
    }
}
