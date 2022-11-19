package com.it.helloword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
    @RequestMapping("/test1")
    public String te1(){
        return "show.html";
    }

    @RequestMapping("/test2")
    public String te2(){
        return "show";
    }

    @RequestMapping("/test3")
    public String te3(){
        return "redirect:/show.html";
    }
}
