package com.tm.sbia.feature.service;

import com.tm.sbia.feature.domain.DemoUser;

public interface DemoUserService {
    /**
     * 保存用户信息
     *
     * @param demoUser 用户
     * @return 保存用户记录条数
     */
    int saveDemoUser(DemoUser demoUser);
}
