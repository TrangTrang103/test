package com.example.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/loginform", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @RequestMapping("/403")
    public String accessDenied() {
        return "/403";
    }
}
