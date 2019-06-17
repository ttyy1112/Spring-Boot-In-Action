package com.tm.sbia.busi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BusinessLogicTH implements BusinessLogic {
    private Logger logger = LoggerFactory.getLogger(BusinessLogicTH.class);

    @Override
    public void process() {
        logger.info("business logic TH!");
    }
}
