package sizhe.chen.configuration;

import org.springframework.context.annotation.Configuration;
import sizhe.chen.annotation.ConditionalOnSystemProperties;
import sizhe.chen.annotation.EnableHelloWorld;

/**
 * HelloWorld 自动装配
 *
 * @Author chensizhe
 * @Date 2022/9/7 10:33 AM
 */
@Configuration // spring 模式注解
@EnableHelloWorld // Enable模块儿
@ConditionalOnSystemProperties(name = "user.name" ,value="clark")
public class HelloWorldAutoConfiguration {
}
