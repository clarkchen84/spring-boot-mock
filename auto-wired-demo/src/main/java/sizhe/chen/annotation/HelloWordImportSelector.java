package sizhe.chen.annotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import sizhe.chen.configuration.HelloWordConfiguration;
import sizhe.chen.configuration.ImportSelectorConfiguration;

import java.util.function.Predicate;

/**
 * HelloWordSelector {@link org.springframework.context.annotation.ImportSelector}
 *
 * @Author chensizhe
 * @Date 2022/9/6 9:37 AM
 */
public class HelloWordImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        return new String[]{ImportSelectorConfiguration.class.getName()};
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return ImportSelector.super.getExclusionFilter();
    }
}
