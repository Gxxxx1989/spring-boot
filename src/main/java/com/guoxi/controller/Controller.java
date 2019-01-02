package com.guoxi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/web/")
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
//    @Autowired
//    private AdminUserService adminUserService;

    @RequestMapping("login")
    public String helloHtml(HashMap<String, Object> map) {
        return "/hello";
    }

}
