package com.example.springboot.mybatis;

import com.example.springboot.mybatis.entity.UserEntity;
import com.example.springboot.mybatis.service.UserService;
import com.example.springboot.mybatis.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    private UserServiceImpl userService;

    @Test
    void contextLoads() {
        List<UserEntity> userEntities = userService.selList();
        System.out.println(userEntities);


    }

}
