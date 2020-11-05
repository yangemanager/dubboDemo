package com.yuan.www.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.yuan.www.service.HelloServier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(version = "1.0",check = false)
    private HelloServier helloServier;

    @RequestMapping("/hello")
    public String hello(){
        return helloServier.hello();
    }
}
