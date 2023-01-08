package com.atguigu.boot.controller;

import com.atguigu.boot.mapper.UserMapper;
import com.atguigu.boot.pojo.UserBean;
import com.atguigu.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

//    UserMapper mapper;
    @Autowired
    UserService mapper;
    @GetMapping("/user")
    @ResponseBody
    public UserBean get(int id){
        System.out.println(id);
        UserBean userBean = mapper.getById(id);
        System.out.println(userBean);
        return userBean;
    }
}
