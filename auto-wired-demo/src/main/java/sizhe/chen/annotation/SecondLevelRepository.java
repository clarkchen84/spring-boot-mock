package sizhe.chen.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 模式注解的层次性
 *
 * @Author chensizhe
 * @Date 2022/9/5 3:16 PM
 */
@FirstLevelRepository
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface SecondLevelRepository {
    String value() default  "";
}
