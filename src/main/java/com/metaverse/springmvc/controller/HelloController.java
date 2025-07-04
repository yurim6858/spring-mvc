package com.metaverse.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("api/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("api/get")
    @ResponseBody
    public String get(){
        return "Get Method 요청";
    }

    @PostMapping("api/post")
    @ResponseBody
    public String post(){
        return "Post Method 요청";
    }
}
