package com.tm.sbia.cart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping("/sayHello")
    public String sayHelloToWorld() {
        logger.info("Say hello to user!");
        return "Hello World";
    }
}
