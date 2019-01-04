package com.guoxi.controller;

import com.guoxi.module.dao.UserInfo;
import com.guoxi.module.dao.UserInfoMapper;
import com.guoxi.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    UserService userService;

//    @RequestMapping(value = {"/", "/login"})
//    public String testHtml() {
//        return "index.html";
//    }
//
//    @RequestMapping(value = "/user")
//    public String user(HttpServletRequest request) {
//        String userName = request.getParameter("user");
//        String pwd = request.getParameter("pwd");
//        System.out.println("user:" + userName);
//        System.out.println("pwd:" + pwd);
//        return "user.html";
//    }
//
//    @RequestMapping(value = "/login1")
//    public String testJS() {
//        return "login.html";
//    }
    @ApiOperation(value = "新增用户" , notes = "新增用户信息")
    @PostMapping(value = "/insert")
    public int testSwagger2(UserInfo userInfo) {
        return userService.insertUser(userInfo);
    }

}
