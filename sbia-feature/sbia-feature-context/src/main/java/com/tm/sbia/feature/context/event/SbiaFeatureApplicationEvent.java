package com.tm.sbia.feature.context.event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 */
public class SbiaFeatureApplicationEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public SbiaFeatureApplicationEvent(Object source) {
        super(source);
    }
}
