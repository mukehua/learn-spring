package com.mkh.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: mukehua[mkh@91licheng.cn]
 * @DATE: 2018/4/12 16:23
 * @version: V1.0
 * @review: mukehua/2018/4/12 16:23
 */
@RestController
public class ExampleController {
    @RequestMapping("")
    public String home() {
        return "hello world!";
    }
}
