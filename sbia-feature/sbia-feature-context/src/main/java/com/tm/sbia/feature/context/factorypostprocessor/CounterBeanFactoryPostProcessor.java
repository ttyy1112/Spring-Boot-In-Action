package com.tm.sbia.feature.context.factorypostprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

@Component
public class CounterBeanFactoryPostProcessor implements BeanFactoryPostProcessor, PriorityOrdered {
    private Logger logger = LoggerFactory.getLogger(CounterBeanFactoryPostProcessor.class);

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        logger.info("executing com.tm.sbia.feature.context.factorypostprocessor.CounterBeanFactoryPostProcessor.postProcessBeanFactory");

        logger.info("总共定义bean {}个，post factorypostprocessor bean {}个，其中单例bean {}个。", beanFactory.getBeanDefinitionCount(), beanFactory.getBeanPostProcessorCount(), beanFactory.getSingletonCount());

        logger.info("All bean definition list :");
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            logger.info("{}: {}", i + 1, beanDefinitionNames[i]);
        }

        logger.info("All singleton bean list :");
        String[] singletonNames = beanFactory.getSingletonNames();
        for (int i = 0; i < singletonNames.length; i++) {
            logger.info("{}: {}", i, singletonNames[i]);
        }
    }

    @Override
    public int getOrder() {
        return PriorityOrdered.HIGHEST_PRECEDENCE;
    }
}
