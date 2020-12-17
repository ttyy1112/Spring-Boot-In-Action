package com.atang.sbia.demo.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Bootstrap.class)
public class BootstrapTest {
    @Autowired
    private BeanFactory beanFactory;

    @Test
    public void testAutoConfigurationPackages() {
        List<String> packages = AutoConfigurationPackages.get(beanFactory);
        packages.forEach(p -> System.out.println(p));
    }
}