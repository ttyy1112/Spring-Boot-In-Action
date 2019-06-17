package com.tm.sbia.busi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BusinessLogicCN implements BusinessLogic {
    private Logger logger = LoggerFactory.getLogger(BusinessLogicCN.class);

    @Override
    public void process() {
        logger.info("business logic CN!");
    }
}
