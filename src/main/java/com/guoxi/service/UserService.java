package com.guoxi.service;

import com.guoxi.module.dao.UserInfo;
import org.springframework.stereotype.Service;


public interface UserService {

    public int insertUser(UserInfo userInfo);

    public UserInfo getUserInfo(int id);
}
