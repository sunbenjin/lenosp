package com.capinfo.service.impl;

import com.capinfo.base.BaseMapper;
import com.capinfo.base.impl.BaseServiceImpl;
import com.capinfo.entity.BlogTag;
import com.capinfo.mapper.BlogTagMapper;
import com.capinfo.service.BlogTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuxiaomeng
 * @date 2018/7/28.
 * @email 154040976@qq.com
 */
@Service
public class BlogTagServiceImpl extends BaseServiceImpl<BlogTag, String> implements BlogTagService {

    @Autowired
    private BlogTagMapper blogTagMapper;

    @Override
    public BaseMapper<BlogTag, String> getMappser() {
        return blogTagMapper;
    }
}
