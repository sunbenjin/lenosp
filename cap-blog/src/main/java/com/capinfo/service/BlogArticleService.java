package com.capinfo.service;

import com.capinfo.base.BaseService;
import com.capinfo.entity.ArticleDetail;
import com.capinfo.entity.BlogArticle;
import com.capinfo.model.Article;
import com.capinfo.util.JsonUtil;

import java.util.Date;
import java.util.List;

/**
 * @author zhuxiaomeng
 * @date 2018/9/9.
 * @email 154040976@qq.com
 */
public interface BlogArticleService extends BaseService<BlogArticle, String> {

    List<Article> indexSelect();

    public JsonUtil getDetail(String code);

    public JsonUtil detail(String code,String ip);

    List<Article> selectArticle(String code);

    List<Article> selectArticleByTag(String tagCode);

    BlogArticle selectPrevious(Date date);

    BlogArticle selectNext(Date date);

    boolean addArticle(ArticleDetail articleDetail);

    boolean updateArticle(Article article,List<String> categoryIds,List<String> tags);

}
