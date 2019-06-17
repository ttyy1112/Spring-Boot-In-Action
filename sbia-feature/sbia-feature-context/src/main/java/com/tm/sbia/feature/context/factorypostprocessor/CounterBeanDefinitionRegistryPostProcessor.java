package com.tm.sbia.feature.context.factorypostprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order
public class CounterBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    private Logger logger = LoggerFactory.getLogger(CounterBeanDefinitionRegistryPostProcessor.class);

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        logger.info("executing com.tm.sbia.feature.context.factorypostprocessor.CounterBeanDefinitionRegistryPostProcessor.postProcessBeanDefinitionRegistry");

        logger.info("总共定义bean {}个。", registry.getBeanDefinitionCount());
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        logger.info("executing com.tm.sbia.feature.context.factorypostprocessor.CounterBeanDefinitionRegistryPostProcessor.postProcessBeanFactory");

        logger.info("总共定义bean {}个，post factorypostprocessor bean {}个，其中单例bean {}个。", beanFactory.getBeanDefinitionCount(), beanFactory.getBeanPostProcessorCount(), beanFactory.getSingletonCount());
    }


}
