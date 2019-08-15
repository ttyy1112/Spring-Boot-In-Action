package com.tm.sbia.feature.service.impl;

import com.tm.sbia.feature.SbiaFeatureApp;
import com.tm.sbia.feature.domain.DemoUser;
import com.tm.sbia.feature.service.DemoUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SbiaFeatureApp.class)
public class DemoUserServiceImplTest {

    @Autowired
    private DemoUserService demoUserService;

    @Test
    public void saveDemoUser() {
        DemoUser demoUser = new DemoUser();
        demoUser.setCode("wc");
        demoUser.setName("卫生间");
        demoUser.setSex(Byte.parseByte("0"));
        Calendar birthday = Calendar.getInstance();
        birthday.set(2001, 12, 22);
        demoUser.setBirthday(birthday.getTime());
        demoUser.setCreateUser("system");
        demoUser.setCreateTime(Calendar.getInstance().getTime());
        demoUser.setDr(Byte.parseByte("0"));
        int updateCount = demoUserService.saveDemoUser(demoUser);
        Assert.assertEquals(1, updateCount);
    }
}