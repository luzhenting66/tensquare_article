package cn.pipilu.tensquare.article.service;

import cn.pipilu.tensquare.article.entity.ArticleEntity;

import java.util.List;

public interface ArticleService {
    List<ArticleEntity> findList(int pageNo, int pageSize);
}
