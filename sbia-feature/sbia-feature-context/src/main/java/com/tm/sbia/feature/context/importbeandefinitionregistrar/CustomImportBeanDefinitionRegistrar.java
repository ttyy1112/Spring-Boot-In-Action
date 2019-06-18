package com.tm.sbia.feature.context.importbeandefinitionregistrar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;

public class CustomImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar, EnvironmentAware, BeanFactoryAware, BeanClassLoaderAware, ResourceLoaderAware {
    private Logger logger = LoggerFactory.getLogger(CustomImportBeanDefinitionRegistrar.class);

    private ClassLoader classLoader;
    private BeanFactory beanFactory;
    private Environment environment;
    private ResourceLoader resourceLoader;

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // register your custom bean definition here

        // here are some useful utils:
        // org.springframework.boot.autoconfigure.AutoConfigurationPackages
        // org.springframework.context.annotation.ClassPathBeanDefinitionScanner

        // you can implement EnvironmentAware, BeanFactoryAware, BeanClassLoaderAware, ResourceLoaderAware as you need.
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
