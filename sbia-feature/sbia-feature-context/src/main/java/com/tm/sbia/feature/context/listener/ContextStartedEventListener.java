package com.tm.sbia.feature.context.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStartedEventListener implements ApplicationListener<ContextStartedEvent> {
    private Logger logger = LoggerFactory.getLogger(ContextStartedEventListener.class);
    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        logger.info("========== Application context started!");
    }
}
