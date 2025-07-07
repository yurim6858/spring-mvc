package com.metaverse.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloViewController {
    private static long visitCount = 0; //변수들은 계속 여기 생성

    @GetMapping("/static-hello")
    public String hello(){
        return "hello.html";
    }

    @GetMapping("/html/redirect") // 이 주소로는 못 들어감
    public String htmlRedirect(){
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templetes") //이 주소로 들어가고 싶으면 thymeleaf라는 라이브러리가 있어야함.
    public String htmlTempletes(){ // 템플릿 폴더에 넣어야함. 폴더마다 기능이 다름
        // prefix classpath : resources까지의 경로 + templates/ 까지 가지고 있음
        // suffix .html
        return "hello-templete";//String 반환 말고 해당 문자열을 가진 파일이 return
    }

    @GetMapping("html/dynamic")
    public String htmlDynamic(Model model){ // html로 넘겨 동적으로 만들기 위해 모델 모델을 매게 변수로 넣어줌
        visitCount++;
        model.addAttribute("visits", visitCount); // html에서 쓰일 변수명 : 데이터 binding
        return "hello-dynamic";
    }
}
