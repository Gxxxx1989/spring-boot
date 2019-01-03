package com.guoxi.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller

public class Controller {
    @RequestMapping("/login")
    public String testHtml() {
//        String userName=request.getParameter("user");
//        String pwd=request.getParameter("pwd");
//        System.out.println("userName:"+userName+"pwd:"+pwd);
        return "index.html";
    }
}
