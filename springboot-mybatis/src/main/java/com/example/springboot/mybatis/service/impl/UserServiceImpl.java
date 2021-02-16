package com.example.springboot.mybatis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.example.springboot.mybatis.entity.UserEntity;
import com.example.springboot.mybatis.mapper.UserDao;
import com.example.springboot.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {


    @Override
    public List<UserEntity> selList() {
        return baseMapper.selectList(null);
    }
}