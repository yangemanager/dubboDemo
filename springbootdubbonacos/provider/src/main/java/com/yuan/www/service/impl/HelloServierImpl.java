package com.yuan.www.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yuan.www.service.HelloServier;


@Service(version = "1.0")
public class HelloServierImpl implements HelloServier {


    @Override
    public String hello() {
        return "hello World";
    }
}
