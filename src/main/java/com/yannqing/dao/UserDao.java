package com.yannqing.dao;

import com.yannqing.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from yan_user where username=#{username}")
    User getUserByUsername(String username);



}
