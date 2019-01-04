package com.guoxi.service.impl;

import com.guoxi.module.dao.UserInfo;
import com.guoxi.module.dao.UserInfoMapper;
import com.guoxi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public int insertUser(UserInfo userInfo) {
        return userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public String getUserInfo(String id) {
        return null;
    }
}
