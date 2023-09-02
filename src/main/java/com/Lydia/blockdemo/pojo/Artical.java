package com.Lydia.blockdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Artical {
    private Integer articles;
    private Integer uid;
    private String title;
    private String content;
    private String publishedTime;
    private Integer likes;
    private Integer favourites;
    private Integer comments;


}
