package com.mkh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: mukehua[mkh@91licheng.cn]
 * @DATE: 2018/4/12 16:21
 * @version: V1.0
 * @review: mukehua/2018/4/12 16:21
 */
@EnableAutoConfiguration
@ComponentScan
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
