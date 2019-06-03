package com.tm.sbia.cart.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.*;
import org.springframework.core.ResolvableType;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ContextEventListener implements GenericApplicationListener {
    private Logger logger = LoggerFactory.getLogger(ContextClosedEventListener.class);

    @Override
    public boolean supportsEventType(ResolvableType eventType) {
        Class<?> type = eventType.getRawClass();
        if (type == null) {
            return false;
        }
        return ContextRefreshedEvent.class.isAssignableFrom(type)
                || ContextStartedEvent.class.isAssignableFrom(type)
                || ContextClosedEvent.class.isAssignableFrom(type)
                || ContextStoppedEvent.class.isAssignableFrom(type);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        logger.info("========== " + event.getClass().getName());
    }
}
