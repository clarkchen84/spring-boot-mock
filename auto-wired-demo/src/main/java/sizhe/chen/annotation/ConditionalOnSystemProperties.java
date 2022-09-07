package sizhe.chen.annotation;


import org.springframework.context.annotation.Conditional;
import sizhe.chen.condition.OnSystemPropertiesCondition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 使用编程的方式实现Spring的条件注入
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Conditional(OnSystemPropertiesCondition.class)
public @interface ConditionalOnSystemProperties {

    /**
     * java 系统属性名
     *
     * @return
     */
    String name();

    /**
     * java 系统属性值
     *
     * @return
     */
    String value();

}
