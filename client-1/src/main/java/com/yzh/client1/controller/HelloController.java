package com.yzh.client1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanzhihao
 * @since 2021/11/26
 */
@RestController
@Slf4j
public class HelloController {
    @Value("${name}")
    private String name;

    @GetMapping("/hello")
    public String hello() {
        return "Hello " + name;
    }
}
