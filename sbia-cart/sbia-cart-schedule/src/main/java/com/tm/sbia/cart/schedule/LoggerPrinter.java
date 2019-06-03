package com.tm.sbia.cart.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;

//@Component
public class LoggerPrinter {
    private Logger logger = LoggerFactory.getLogger(LoggerPrinter.class);

    @Scheduled(cron = "0/1 * * ? * *")
    public void printLogger() {
        logger.info("I am executing! Amazing!ing!ing!ing!ing!");
    }

    @Scheduled(cron = "0/1 * * ? * *")
    public void printLogger2() {
        logger.info("I am executing! Sorry!Sorry!Sorry!Sorry!Sorry!");
    }

    @Scheduled(cron = "0 0 1 ? * 2")
    public void printLoggerWeekly() {
        logger.info(Calendar.getInstance().getWeeksInWeekYear() + " : I am executing! Amazing!ing!ing!ing!ing!");
    }
}
