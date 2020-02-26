package com.capinfo.service.impl;

import com.capinfo.base.BaseMapper;
import com.capinfo.base.impl.BaseServiceImpl;
import com.capinfo.entity.ArticleCategory;
import com.capinfo.mapper.ArticleCategoryMapper;
import com.capinfo.service.ArticleCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhuxiaomeng
 * @date 2018/10/11.
 * @email 154040976@qq.com
 */
@Service
public class ArticleCategoryServiceImpl extends BaseServiceImpl<ArticleCategory, String>
        implements ArticleCategoryService {

    @Autowired
    private ArticleCategoryMapper articleCategoryMapper;

    @Override
    public BaseMapper<ArticleCategory, String> getMappser() {
        return articleCategoryMapper;
    }

    @Override
    public void delByIds(List<String> ids) {
        articleCategoryMapper.delByIds(ids);
    }
}
