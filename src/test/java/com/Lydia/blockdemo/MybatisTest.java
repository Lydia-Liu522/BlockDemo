package com.Lydia.blockdemo;

import com.Lydia.blockdemo.mapper.UserMapper;
import com.Lydia.blockdemo.pojo.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisTest {
    @Autowired
    private UserMapper userMapper;


    @Test
    public void userTest(){
        List<User> users = userMapper.selectAll();
        System.out.println(users);
    }
}
