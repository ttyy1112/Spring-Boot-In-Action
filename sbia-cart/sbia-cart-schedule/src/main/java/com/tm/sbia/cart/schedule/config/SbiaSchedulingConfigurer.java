package com.tm.sbia.cart.schedule.config;

import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * 通过该方式设置的Scheduler，默认使用org.springframework.scheduling.concurrent.ConcurrentTaskScheduler
 */
//@Component
public class SbiaSchedulingConfigurer implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
                r -> new Thread(r, "sbia-schedule-")));
    }
}
