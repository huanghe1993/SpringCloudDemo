package com.yzh.client1.controller;

import com.yzh.client1.bean.Dog;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/**
 * @since 2021/11/5
 */
@RestController
@RequestMapping("/client1")
@Slf4j
public class Client1Controller {
    private final RestTemplate restTemplate;

//    @Value("${client.port}")
//    private String port;

    public Client1Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("oneDog")
    public Dog oneDog() {
        Dog dog = new Dog();
        dog.setAge(2);
        dog.setName("HH");
        //System.out.println(port);
        return dog;
    }

    @GetMapping("twoDog")
    public Dog twoDog() {
        log.info("hahaa");
        final ResponseEntity<Dog> forEntity = restTemplate.getForEntity("https://eureka-server1:7883/server1/twoDog",
            Dog.class);
        return forEntity.getBody();
    }
}
