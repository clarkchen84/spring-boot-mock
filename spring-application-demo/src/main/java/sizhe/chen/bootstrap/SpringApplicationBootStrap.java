package sizhe.chen.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * {@link org.springframework.boot.SpringApplication}引导类
 *
 * @Author chensizhe
 * @Date 2022/9/7 3:35 PM
 */
@SpringBootApplication
public class SpringApplicationBootStrap {
    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(SpringApplicationBootStrap.class);
//        application.setWebApplicationType(WebApplicationType.NONE);
//        application.run(args);

        SpringApplication.run(SpringApplicationBootStrap.class, args);
    }
}
