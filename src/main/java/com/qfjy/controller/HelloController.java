package com.qfjy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/info")
    public  String info(){
        return "hello spring boot info 项目经理123";
    }
    //开发人员写了一句话
}
