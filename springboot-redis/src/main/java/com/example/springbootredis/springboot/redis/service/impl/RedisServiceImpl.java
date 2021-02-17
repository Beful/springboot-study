package com.example.springbootredis.springboot.redis.service.impl;

import com.example.springbootredis.springboot.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl implements RedisService {


    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public void redisTest() {
        redisTemplate.opsForValue().set("key","value");

        String key = redisTemplate.opsForValue().get("key");

        System.out.println(key);
    }
}
