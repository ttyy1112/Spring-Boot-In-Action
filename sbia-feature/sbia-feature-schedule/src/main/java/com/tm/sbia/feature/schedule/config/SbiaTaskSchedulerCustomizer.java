package com.tm.sbia.feature.schedule.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.task.TaskSchedulerCustomizer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

@Component
public class SbiaTaskSchedulerCustomizer implements TaskSchedulerCustomizer {
    private Logger logger = LoggerFactory.getLogger(SbiaTaskSchedulerCustomizer.class);

    @Override
    public void customize(ThreadPoolTaskScheduler taskScheduler) {
        taskScheduler.setErrorHandler(t -> {
            logger.error("执行任务时出现异常！", t);
        });
    }
}
