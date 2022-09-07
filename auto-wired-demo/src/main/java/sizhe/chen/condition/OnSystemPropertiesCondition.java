package sizhe.chen.condition;

import org.springframework.boot.system.SystemProperties;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import sizhe.chen.annotation.ConditionalOnSystemProperties;

import java.util.Map;

/**
 * 系统属性条件判断
 *
 * @Author chensizhe
 * @Date 2022/9/7 9:03 AM
 */
public class OnSystemPropertiesCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Map<String, Object> map =  metadata.getAnnotationAttributes(ConditionalOnSystemProperties.class.getName());
        String name = (String) map.get("name");
        String value = (String) map.get("value");

        return SystemProperties.get(name).equals(value);
    }
}
