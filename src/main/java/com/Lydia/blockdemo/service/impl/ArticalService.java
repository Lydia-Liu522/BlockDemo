package com.Lydia.blockdemo.service.impl;

import java.util.List;

public interface ArticalService {
    void add(Article article);
    List<Article> selectAll();

    Article selectByArticleId(Integer articleId);
}
