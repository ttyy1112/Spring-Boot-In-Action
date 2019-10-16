package com.tm.sbia.feature.context.listener;

import com.tm.sbia.feature.context.event.SbiaFeatureApplicationEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SbiaFeatureEventListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(SbiaFeatureEventListener.class);

    @EventListener
    public void listenSbiaFeature(SbiaFeatureApplicationEvent event) {
        LOGGER.info("com.tm.sbia.feature.context.listener.SbiaFeatureEventListener.listenSbiaFeature invoked!");
    }
}
