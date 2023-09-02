package com.Lydia.blockdemo.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result implements Serializable {//给前端传递数据的类，实现序列化接口
    private Integer code;//状态码
    private String message;
    private Object data;

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
