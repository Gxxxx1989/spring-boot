package com.guoxi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.Map;

@RestController
public class Controller {
    @RequestMapping("/hello-guoxi")
    public String method() {
        return "hello world";
    }


    @RequestMapping(value = {"/", "/index"})
    public String index(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", "hello");
        return "index";
    }
}
