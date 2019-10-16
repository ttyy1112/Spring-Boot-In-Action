package com.tm.sbia.feature.context.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * 事件发布
 */
@Component
public class SbiaFeatrueEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishSbiaFeatureEvent() {
        applicationEventPublisher.publishEvent(new SbiaFeatureApplicationEvent(this));
    }
}
