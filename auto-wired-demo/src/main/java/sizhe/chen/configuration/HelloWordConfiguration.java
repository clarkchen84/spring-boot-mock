package sizhe.chen.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWordConfiguration
 *
 * @Author chensizhe
 * @Date 2022/9/6 9:40 AM
 */
@Configuration
public class HelloWordConfiguration {

    @Bean// 默认方法名就是Bean的名称
    public String helloWorld(){
        return "helloWorld";
    }
}
