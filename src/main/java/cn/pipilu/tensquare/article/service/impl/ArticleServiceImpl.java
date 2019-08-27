package cn.pipilu.tensquare.article.service.impl;

import cn.pipilu.tensquare.article.entity.ArticleEntity;
import cn.pipilu.tensquare.article.mapper.ArticleMapper;
import cn.pipilu.tensquare.article.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public List<ArticleEntity> findList(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        PageInfo<ArticleEntity> pageInfo = new PageInfo<>(articleMapper.selectAll());
        return pageInfo.getList();
    }
}
