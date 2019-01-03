package com.guoxi.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller

public class Controller {
    @RequestMapping("/login")
    public String testHtml() {
        return "index.html";
    }
}
