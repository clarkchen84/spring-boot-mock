package sizhe.chen.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * HelloWorld{@link  ApplicationListener} 监听 {@link ContextRefreshedEvent }
 *
 * @Author chensizhe
 * @Date 2022/9/9 9:48 AM
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(" HelloWorld:" + event.getApplicationContext().getId() + ", timestamp:" + event.getTimestamp());
    }
}
