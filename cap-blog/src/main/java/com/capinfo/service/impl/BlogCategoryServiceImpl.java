package com.capinfo.service.impl;

import com.capinfo.service.BlogCategoryService;
import com.capinfo.base.BaseMapper;
import com.capinfo.base.impl.BaseServiceImpl;
import com.capinfo.entity.BlogCategory;
import com.capinfo.mapper.BlogCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuxiaomeng
 * @date 2018/7/22.
 * @email 154040976@qq.com
 */
@Service
public class BlogCategoryServiceImpl extends BaseServiceImpl<BlogCategory, String> implements BlogCategoryService {

    @Autowired
    private BlogCategoryMapper blogCategoryMapper;

    @Override
    public BaseMapper<BlogCategory, String> getMappser() {
        return blogCategoryMapper;
    }
}
