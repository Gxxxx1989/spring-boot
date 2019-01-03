package com.guoxi.controller;

import com.guoxi.module.dao.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@org.springframework.stereotype.Controller
public class Controller {


    @RequestMapping(value = {"/", "/login"})
    public String testHtml() {
        return "index.html";
    }

    @RequestMapping(value = "/user")
    public String user(HttpServletRequest request) {
        String userName = request.getParameter("user");
        String pwd = request.getParameter("pwd");
        System.out.println("user:" + userName);
        System.out.println("pwd:" + pwd);
        return "user.html";
    }

    @RequestMapping(value = "/login1")
    public String testJS() {
        return "login.html";
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // TODO Auto-generated method stub

        response.setCharacterEncoding("utf-8");

        response.setContentType("text/plain; charset=utf-8");

        String user = request.getParameter("name");

        String pwd = request.getParameter("pwd");

        System.out.println(user + "-----------------" + pwd);

        String select = "select count(*) from user where UserName = '" + user + "' and Password = '" + pwd + "'";


        int a =1;//= operatedatabase.validate(select);

        if (a == 1) {

            request.getSession().setAttribute("UserName", user);

        }

        response.getWriter().write(String.valueOf(a));

    }
}
