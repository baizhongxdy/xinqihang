package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Autohr baishenghu
 * @Date 2017/12/6 11:25
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "Hello, SpringBoot!";
    }
}
