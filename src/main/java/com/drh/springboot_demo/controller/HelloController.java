package com.drh.springboot_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//在springboot中，使用RestController注解，该类里面的方法都返回json格式数据
@RestController
public class HelloController {

    @RequestMapping(value = "hello")
    public String sayHello(){
        return "Hi";
    }
}
