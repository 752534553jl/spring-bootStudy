package com.springboot.study.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *RestController组合注解
 * 是以下2个注解的组合
 */
@RestController
public class HelloCtroller {
    @RequestMapping(value = {"/hello","hi"},method = RequestMethod.GET)
    public String say(){
        String age;
        return "hello world";

    }

}
