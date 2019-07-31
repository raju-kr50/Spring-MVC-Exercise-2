package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/login")
    public String sendMessage(ModelAndView modelAndView) {
        User user= new User();
        user.setUserName("Raju");
        user.setPassword("raju.kr50");
        modelAndView= new ModelAndView();
        modelAndView.addObject("message",user.getUserName());
        return "greetings";
    }
    @RequestMapping("/")
    public String login() {
        return "index";
    }

}