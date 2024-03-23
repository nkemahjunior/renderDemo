package com.zeco.renderDemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test1")
    public String test1(){
        return "deployment 1";
    }

   @GetMapping("/test2")
    public String test2(){
        return "deployment 2";
    }
/*
    @GetMapping("/test2")
    public String test3(){
        return "deployment 3";
    }*/
}
