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

public class AfterHelloWorldContextInitializer<C extends ConfigurableApplicationContext>
        implements ApplicationContextInitializer<C> ,Ordered {
    @Override
    public void initialize(C applicationContext) {
        System.out.println("AfterHelloWorldContextInitializer:" + applicationContext.getId());
    }
    @Override
    public int getOrder() {
        return HIGHEST_PRECEDENCE+1;
    }
}
