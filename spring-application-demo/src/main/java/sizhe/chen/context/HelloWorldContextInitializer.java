package sizhe.chen.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * HelloWorldContextInitializer
 *
 * @Author chensizhe
 * @Date 2022/9/7 4:51 PM
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldContextInitializer<C extends ConfigurableApplicationContext>
        implements ApplicationContextInitializer<C>{
    @Override
    public void initialize(C applicationContext) {
        System.out.println("HelloWorldContextInitializer:" + applicationContext.getId());
    }


}
