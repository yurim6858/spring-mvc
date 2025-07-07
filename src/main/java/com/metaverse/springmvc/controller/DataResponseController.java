package com.metaverse.springmvc.controller;

import com.metaverse.springmvc.domain.Star;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataResponseController {
    @GetMapping("response/json/string")
    @ResponseBody
    public String helloStringJson(){
        return "{\"name\" : \"Meta\" , \"age\" : 95}";// " 대신 \"로 대체
    }

    @GetMapping("response/json/instance")
    @ResponseBody
    public Star helloInstanceJson(){
        return new Star("star",5); // = Star star = new Star();
    }
}
