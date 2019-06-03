package com.tm.sbia.cart.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {
    private Logger logger = LoggerFactory.getLogger(ContextClosedEventListener.class);

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        logger.info("========== Application context closed!");
    }
}
