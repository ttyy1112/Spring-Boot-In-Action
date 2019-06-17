package com.tm.sbia.feature.context.importselector;

import com.tm.sbia.busi.CNConfiguration;
import com.tm.sbia.busi.THConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.MultiValueMap;

public class BusinessLogicAImportSelector implements ImportSelector, EnvironmentAware, BeanFactoryAware, BeanClassLoaderAware, ResourceLoaderAware {
    private Logger logger = LoggerFactory.getLogger(BusinessLogicAImportSelector.class);

    private BeanFactory beanFactory;
    private ClassLoader classLoader;
    private Environment environment;
    private ResourceLoader resourceLoader;

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        if (!importingClassMetadata.hasAnnotation(Contry.class.getName())) {
            return new String[0];
        }

        MultiValueMap<String, Object> contry = importingClassMetadata.getAllAnnotationAttributes(Contry.class.getName());
        if (contry.get("name").equals("TH")) {
            logger.info("当前版本是泰国版，返回泰国版相关的配置！");
            return new String[]{THConfiguration.class.getName()};
        } else {
            logger.info("当前版本是中国版，返回中国版相关的配置！");
            return new String[]{CNConfiguration.class.getName()};
        }
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}
