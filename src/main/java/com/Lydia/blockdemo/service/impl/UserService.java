package com.Lydia.blockdemo.service.impl;

import com.Lydia.blockdemo.pojo.User;

public interface UserService {

    void add(User user);
    User selectByUsername(String username);
}
