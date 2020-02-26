package com.capinfo.service;

import com.capinfo.base.BaseService;
import com.capinfo.entity.ArticleCategory;

import java.util.List;

/**
 * @author zhuxiaomeng
 * @date 2018/10/11.
 * @email 154040976@qq.com
 */
public interface ArticleCategoryService extends BaseService<ArticleCategory, String> {

    void delByIds(List<String> ids);
}
