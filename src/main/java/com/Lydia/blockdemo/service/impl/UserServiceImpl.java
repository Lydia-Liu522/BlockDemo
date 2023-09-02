package com.Lydia.blockdemo.service.impl;

import com.Lydia.blockdemo.mapper.UserMapper;
import com.Lydia.blockdemo.pojo.User;
import org.apache.ibatis.ognl.security.UserMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;


    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public User selectByUsername(String username) {
       return username.selectByUsername(username);

    }
}
