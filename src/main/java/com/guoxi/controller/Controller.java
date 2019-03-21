package com.guoxi.controller;

import com.guoxi.module.dao.UserInfo;
import com.guoxi.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value="controller",tags={"用户操作接口"})
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
    @ResponseBody
    public int insertUser(@RequestBody UserInfo userInfo) {
        return userService.insertUser(userInfo);
    }

    @ApiOperation(value = "查询用户" , notes = "查询用户信息")
    @PostMapping(value = "/getUser")
    @ResponseBody
    public  UserInfo getUser(int id) {
        return userService.getUserInfo(id);
    }

}
