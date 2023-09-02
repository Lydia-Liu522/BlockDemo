package com.Lydia.blockdemo.controller;

import com.Lydia.blockdemo.pojo.Result;
import com.Lydia.blockdemo.pojo.User;
import com.Lydia.blockdemo.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapper("/register")
    public Result add(@RequestBody User user){
        Date date = new Dat2();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        user.setRegistrationTime(df.format(date));
        String password = user.getPassword();
        String salt = "114514";
        password = password+salt;
        password = DigestUtils.md5DigestAsHex(password.getBytes(StandardCharsets.UTF_8));
        user.setPassword(password);
        try {
            userService.add(user);
            return new Reuslt(200,"用户注册成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500,"注册失败", e);
        }

    }
    @RequestMapper("/login")
    public Result login(@RequestBody User user){
        User result = userService.selectByUsername(user.getUsername());

        if(result==null){
            return new Result(300,"该用户未注册");
        }
        String password = user.getPassword();
        String salt='114514';
        password = password+salt;
        password=DigestUtils.md5DigestAsHex(password.getBytes(StandardCharsets.UTF_8));
        if(result.getPassword().equals(password)){
            session.setAttribute("uid",result.getUid());
            return new Result(200,"登录成功");
        }else{
            return new Result(300,"密码错误");
        }

    }
}
