package com.yannqing.service.impl;

import com.yannqing.dao.UserDao;
import com.yannqing.pojo.User;
import com.yannqing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User getUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }
}
