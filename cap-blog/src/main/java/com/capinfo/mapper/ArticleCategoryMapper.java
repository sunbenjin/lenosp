package com.capinfo.mapper;

import com.capinfo.base.BaseMapper;
import com.capinfo.entity.ArticleCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleCategoryMapper extends BaseMapper<ArticleCategory, String> {

    void delByIds(@Param("ids") List<String> ids);
}