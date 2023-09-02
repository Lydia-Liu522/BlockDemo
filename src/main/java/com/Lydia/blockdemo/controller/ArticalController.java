package com.Lydia.blockdemo.controller;

import com.Lydia.blockdemo.pojo.Artical;
import com.Lydia.blockdemo.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;
import java.net.HttpCookie;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping
public class ArticalController {
    @Autowired
    private ArticalController articalController;

    @RequestMapper("/add")
    public Result add(@RequestBody Article article,HttpSession session){
        Integer uid = (Integer) session.getAttribute("uid") ;
        article.setUid(uid);
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH-mm;ss");
        article.setPublishedTime(df.format(date));
        try {
            articalService.add(article);
            return new Result(200,"文章发布成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500,"文章发布失败",e);
        }
    }
    @RequesrMapping("/selectAll")
    public Result selectAll(){
        try {
            List<Artical> articles = articleService.selectALl();
            System.out.println(articles);
            return new Result(200,"查询成功",articles);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500,"查询失败");
        }
    }

    @RequesrMapping("/selectByArticleId")
    public  Result selectByArticleId(String articleId){
        try {
            Article article = articleService.selectByArticleId(Integer.valueOf(articleId));
            return new Result(200,"查询成功",article);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return new Result(500,"查询失败",e);
        }
    }
}
