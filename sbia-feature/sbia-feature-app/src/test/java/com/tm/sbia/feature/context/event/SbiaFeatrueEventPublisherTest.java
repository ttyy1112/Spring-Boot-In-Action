package com.tm.sbia.feature.context.event;

import com.tm.sbia.feature.SbiaFeatureApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SbiaFeatureApp.class)
public class SbiaFeatrueEventPublisherTest {

    @Autowired
    private SbiaFeatrueEventPublisher publisher;

    @Test
    public void publishSbiaFeatureEvent() {
        publisher.publishSbiaFeatureEvent();
    }
}