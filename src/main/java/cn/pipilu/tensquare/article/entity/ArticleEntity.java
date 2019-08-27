package cn.pipilu.tensquare.article.entity;

import cn.pipilu.plus.common.base.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "tb_article")
public class ArticleEntity extends BaseEntity {

    private static final long serialVersionUID = 5036032491301709451L;
}
