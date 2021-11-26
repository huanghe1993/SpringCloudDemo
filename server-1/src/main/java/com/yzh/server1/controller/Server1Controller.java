package com.yzh.server1.controller;

import com.yzh.server1.bean.Dog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @since 2021/11/5
 */
@RestController
@RequestMapping("/server1")
@Slf4j
public class Server1Controller {

    @GetMapping("twoDog")
    public Dog oneDog() {
        Dog dog = new Dog();
        dog.setAge(2);
        dog.setName("HH");
        log.info("server1 ");
        return dog;
    }
}
