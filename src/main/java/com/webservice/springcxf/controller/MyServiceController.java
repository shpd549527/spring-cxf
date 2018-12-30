package com.webservice.springcxf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 高铁墩
 * @Description:
 * @Date: Create in 0:23 2018/12/30
 */
@RestController
@RequestMapping("/myService")
public class MyServiceController {

    @RequestMapping("/say")
    public String say(){
        return "hello";
    }

    @RequestMapping("/error")
    public String error(){
        return "error";
    }

}
