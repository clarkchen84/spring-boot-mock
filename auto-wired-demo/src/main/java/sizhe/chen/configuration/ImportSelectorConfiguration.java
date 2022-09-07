package sizhe.chen.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ImportSelectorConfiguration
 *
 * @Author chensizhe
 * @Date 2022/9/6 11:14 AM
 */
@Configuration
public class ImportSelectorConfiguration {

    @Bean
    public String importSelector(){
        return "import selector";
    }
}
