package com.Lydia.blockdemo.mapper;

import com.Lydia.blockdemo.pojo.Artical;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticalMapper {
    void add(Article article);

    List<Artical> selectAll();

    Article selectByArticleId(Integer articleId);
}
