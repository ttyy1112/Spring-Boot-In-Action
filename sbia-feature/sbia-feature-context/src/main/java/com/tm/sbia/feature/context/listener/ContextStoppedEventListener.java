package com.tm.sbia.feature.context.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStoppedEventListener implements ApplicationListener<ContextStoppedEvent> {
    private Logger logger = LoggerFactory.getLogger(ContextStoppedEventListener.class);

    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        logger.info("========== Application context stopped!");
    }
}
