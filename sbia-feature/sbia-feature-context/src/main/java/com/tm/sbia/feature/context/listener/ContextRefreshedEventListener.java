package com.tm.sbia.feature.context.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {
    private Logger logger = LoggerFactory.getLogger(ContextRefreshedEventListener.class);
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        logger.info("========== Application context refreshed!");
    }
}
