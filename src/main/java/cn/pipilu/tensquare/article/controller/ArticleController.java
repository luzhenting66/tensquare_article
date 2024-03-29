package cn.pipilu.tensquare.article.controller;

import cn.pipilu.plus.common.response.Response;
import cn.pipilu.plus.common.util.ResponseUtil;
import cn.pipilu.tensquare.article.entity.ArticleEntity;
import cn.pipilu.tensquare.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/tensquare-article/article")
@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private ResponseUtil responseUtil;
    @RequestMapping(value = "/{pageNo}/{pageSize}",method = RequestMethod.GET)
    public Response<List<ArticleEntity>> findList(@PathVariable("pageNo")int pageNo,@PathVariable("pageSize")int pageSize){
        Response<List<ArticleEntity>> response = new Response<>();
        try {
            response.setRespData(articleService.findList(pageNo,pageSize));
            responseUtil.setRespParam(response);
        }catch (Exception e){
            responseUtil.setRespParam(response,e);
        }
        return response;
    }
}
