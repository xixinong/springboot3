package com.atguigu.boot.service;

import com.atguigu.boot.mapper.UserMapper;
import com.atguigu.boot.pojo.UserBean;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserBean> implements UserService{
}
