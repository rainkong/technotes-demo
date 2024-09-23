package com.technotes.redisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {


    @Autowired
    private RedisTemplate redisTemplate;


    @ResponseBody
    @RequestMapping("/set")
    public String set(@RequestParam(required = false) String key, @RequestParam(required = false) String value) {

        redisTemplate.opsForValue().set(key, value);

        return "ok";
    }

    @ResponseBody
    @RequestMapping("/get")
    public String get(@RequestParam(required = false) String key) {
        return (String)redisTemplate.opsForValue().get(key);
    }
}
