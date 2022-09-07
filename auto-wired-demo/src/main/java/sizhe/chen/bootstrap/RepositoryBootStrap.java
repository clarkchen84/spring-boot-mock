package sizhe.chen.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import sizhe.chen.repository.MyFirstLevelRepository;
import sizhe.chen.repository.MySecondLevelRepository;

/**
 * 仓储的引导类
 *
 * @Author chensizhe
 * @Date 2022/9/5 4:05 PM
 */
@ComponentScan("sizhe.chen.repository")
public class RepositoryBootStrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =  new SpringApplicationBuilder(RepositoryBootStrap.class).web(WebApplicationType.NONE)
                .run(args);


        MyFirstLevelRepository repository = (MyFirstLevelRepository) context.getBean("myFirstLevelRepository");
        System.out.println(repository);
        MySecondLevelRepository mySecondLevelRepository = (MySecondLevelRepository) context.getBean("mySecondLevelRepository");
        System.out.println(mySecondLevelRepository);
        context.close();
    }
}
