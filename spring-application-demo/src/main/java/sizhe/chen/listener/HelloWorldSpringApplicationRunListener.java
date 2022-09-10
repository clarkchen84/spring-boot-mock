package sizhe.chen.listener;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;

/**
 * {@link org.springframework.boot.SpringApplicationRunListener}
 *
 * @Author chensizhe
 * @Date 2022/9/9 3:42 PM
 */
public class HelloWorldSpringApplicationRunListener implements SpringApplicationRunListener {


    public HelloWorldSpringApplicationRunListener(SpringApplication application, String[] args){

    }

    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        System.out.println("HelloWorldSpringApplicationRunListener.starting");
    }
}
