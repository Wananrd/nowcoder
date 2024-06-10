package com.nowcoder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello(Model model){
        return "/hello";
    }
}
