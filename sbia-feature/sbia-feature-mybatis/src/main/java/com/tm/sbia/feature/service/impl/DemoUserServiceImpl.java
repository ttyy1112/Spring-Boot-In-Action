package com.tm.sbia.feature.service.impl;

import com.tm.sbia.feature.dao.DemoUserMapper;
import com.tm.sbia.feature.domain.DemoUser;
import com.tm.sbia.feature.service.DemoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("demoUserService")
public class DemoUserServiceImpl implements DemoUserService {

    @Autowired
    private DemoUserMapper demoUserMapper;

    @Override
    @Transactional
    public int saveDemoUser(DemoUser demoUser) {
        return demoUserMapper.insert(demoUser);
    }
}
