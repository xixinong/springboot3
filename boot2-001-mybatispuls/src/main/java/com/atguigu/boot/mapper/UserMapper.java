package com.atguigu.boot.mapper;

import com.atguigu.boot.pojo.UserBean;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserBean> {

}

