package com.guoxi.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller

public class Controller {
    @RequestMapping(value = {"/","/login"})
    public String testHtml() {
        return "index.html";
    }
    @RequestMapping(value = "/user")
    public String user(){
        return "user.html";
    }
}
