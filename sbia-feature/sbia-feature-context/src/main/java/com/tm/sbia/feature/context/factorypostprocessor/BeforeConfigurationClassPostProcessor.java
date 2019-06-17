package com.tm.sbia.feature.context.factorypostprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

@Component
public class BeforeConfigurationClassPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {
    private Logger logger = LoggerFactory.getLogger(BeforeConfigurationClassPostProcessor.class);

    @Override
    public int getOrder() {
        return PriorityOrdered.HIGHEST_PRECEDENCE;
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        logger.info("executing com.tm.sbia.feature.context.factorypostprocessor.BeforeConfigurationClassPostProcessor.postProcessBeanDefinitionRegistry");

        logger.info("总共定义bean {}个，post factorypostprocessor bean {}个。", registry.getBeanDefinitionCount());

        logger.info("All bean definition list :");
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            logger.info("{}: {}", i + 1, beanDefinitionNames[i]);
        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // do nothing
    }
}
