package com.hwrky.hacker.drinkserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/getmyname")
    public String getMyname(@RequestParam String names){
        System.out.println("接受参数："+names);
        return names;
    }
}
