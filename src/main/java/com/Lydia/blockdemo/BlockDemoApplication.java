package com.Lydia.blockdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.Lydia.mapper")
public class BlockDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlockDemoApplication.class, args);
    }

}
