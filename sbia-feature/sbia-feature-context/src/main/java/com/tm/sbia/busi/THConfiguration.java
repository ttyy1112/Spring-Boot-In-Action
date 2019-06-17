package com.tm.sbia.busi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class THConfiguration {

    @Bean
    public BusinessLogic getBusinessLogic() {
        return new BusinessLogicTH();
    }
}
