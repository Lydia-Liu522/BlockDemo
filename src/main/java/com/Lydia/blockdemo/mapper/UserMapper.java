package com.Lydia.blockdemo.mapper;

import com.Lydia.blockdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectAll();

    void add(User user);

    User selectByUsername(String username);
}
