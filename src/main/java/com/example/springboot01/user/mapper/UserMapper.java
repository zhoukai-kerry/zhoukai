package com.example.springboot01.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot01.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> getList();


}
