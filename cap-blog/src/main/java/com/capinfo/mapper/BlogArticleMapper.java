package com.capinfo.mapper;

import com.capinfo.model.Article;
import com.capinfo.base.BaseMapper;
import com.capinfo.entity.BlogArticle;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface BlogArticleMapper extends BaseMapper<BlogArticle, String> {

    List<Article> indexSelect();

    List<Article> selectArticle(@Param("code") String code);

    List<Article> selectArticleByTag(@Param("tagCode") String tagCode);

    BlogArticle selectPrevious(@Param("createDate")Date date);

    BlogArticle selectNext(@Param("createDate")Date date);
}