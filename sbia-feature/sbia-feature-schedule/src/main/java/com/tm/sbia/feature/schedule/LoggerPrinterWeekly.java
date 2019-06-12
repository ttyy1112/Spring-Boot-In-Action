package com.tm.sbia.feature.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class LoggerPrinterWeekly {
    private Logger logger = LoggerFactory.getLogger(LoggerPrinterWeekly.class);

    @Scheduled(cron = "0/1 * * ? * *")
    public void printLogger() {
        logger.info("I am executing! Amazing!ing!ing!ing!ing!");
    }

    @Scheduled(cron = "0 0 1 ? * TUE")
    public void printLoggerWeekly() {
        logger.info(Calendar.getInstance().getWeeksInWeekYear() + " : I am executing! Amazing!ing!ing!ing!ing!");
    }
}
