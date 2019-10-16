package com.tm.sbia.other.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherController {
    private Logger logger = LoggerFactory.getLogger(OtherController.class);

    @RequestMapping("/other")
    public String sayHelloToWorld() {
        logger.info("Say hello to user!");
        return "Other Hello World";
    }
}
