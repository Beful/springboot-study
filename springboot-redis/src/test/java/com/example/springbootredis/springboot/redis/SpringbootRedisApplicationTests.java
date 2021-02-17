package com.example.springbootredis.springboot.redis;

import com.example.springbootredis.springboot.redis.service.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootRedisApplicationTests {

    @Autowired
    private RedisService redisService;

    @Test
    void contextLoads() {
        redisService.redisTest();
    }

}
