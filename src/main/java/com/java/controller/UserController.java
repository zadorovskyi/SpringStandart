package com.java.controller;

import com.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg", "HELLO WORLD");

        userService.addUser();

        return "hello";
    }

}
