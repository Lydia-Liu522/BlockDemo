package com.Lydia.blockdemo.service.impl;

import com.Lydia.blockdemo.mapper.ArticalMapper;
import com.Lydia.blockdemo.pojo.Artical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticalServiceImpl implements ArticalService{
    @Autowired
    ArticalMapper articalMapper;

    @Override
    public void add(Artical artical){
        articalMapper.add(article);
    }

    @Override
    public List<Article> selectAll(){
        return articalMapper.selectAll();
    }

    @Override
    public Article selectByArticleId(Integer articleId){
        return articalMapper.selectByArticleId(articleId);
    }
}
