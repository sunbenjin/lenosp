package com.capinfo.service.impl;

import com.capinfo.base.BaseMapper;
import com.capinfo.base.impl.BaseServiceImpl;
import com.capinfo.entity.ArticleTag;
import com.capinfo.mapper.ArticleTagMapper;
import com.capinfo.service.ArticleTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuxiaomeng
 * @date 2018/11/19.
 * @email 154040976@qq.com
 */
@Service
public class ArticleTagServiceImpl extends BaseServiceImpl<ArticleTag, String> implements ArticleTagService {

    @Autowired
    private ArticleTagMapper articleTagMapper;

    @Override
    public BaseMapper<ArticleTag, String> getMappser() {
        return articleTagMapper;
    }
}
