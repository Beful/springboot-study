package com.example.springboot.mybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot.mybatis.entity.UserEntity;

import java.util.List;
import java.util.Map;

/**
 * 系统用户
 *
 * @author xiaoxinzai
 * @email littyxin@163.com
 * @date 2021-02-16 15:30:49
 */
public interface UserService extends IService<UserEntity> {

    List<UserEntity> selList();

}

