package sizhe.chen.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 模式注解的派生性
 *
 * @Author chensizhe
 * @Date 2022/9/5 3:16 PM
 */
@Repository
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface FirstLevelRepository {

     String  value() default "";;
}
