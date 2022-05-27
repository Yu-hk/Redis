package com.atguigu.redis_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lenovo
 */

@RestController
public class RedisController {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/redis/test")
    public String redisTest1(){
        redisTemplate.opsForValue().set("name","jack");
        return redisTemplate.opsForValue().get("name");
    }
}
