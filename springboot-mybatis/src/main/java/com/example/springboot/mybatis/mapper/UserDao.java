package com.example.springboot.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.mybatis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户
 * 
 * @author xiaoxinzai
 * @email littyxin@163.com
 * @date 2021-02-16 15:30:49
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
