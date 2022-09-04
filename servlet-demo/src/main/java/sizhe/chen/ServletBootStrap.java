package sizhe.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * ServletBootStrap
 *
 * @Author chensizhe
 * @Date 2022/9/4 12:09 PM
 */

@SpringBootApplication
@ServletComponentScan(basePackages =  "sizhe.chen.web.servlet" )
public class ServletBootStrap {
    public static void main(String[] args) {
        SpringApplication.run(ServletBootStrap.class, args);
    }
}
