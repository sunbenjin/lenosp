package com.capinfo.service.impl;

import com.capinfo.entity.CapPreApproval;
import com.capinfo.service.CapPreApprovalService;
import com.capinfo.util.ReType;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @author: sunbenjin
 * @date: 2020/2/25
 **/
public class CapPreApprovalServiceImpl implements CapPreApprovalService {
    @Override
    public List<CapPreApproval> select(CapPreApproval capPreApproval) {
        return null;
    }

    @Override
    public List<CapPreApproval> selectAll() {
        return null;
    }

    @Override
    public List<CapPreApproval> selectByIds(String ids) {
        return null;
    }

    @Override
    public int selectCount(CapPreApproval capPreApproval) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(CapPreApproval record) {
        return 0;
    }

    @Override
    public int insertSelective(CapPreApproval record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(CapPreApproval record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CapPreApproval record) {
        return 0;
    }

    @Override
    public List<CapPreApproval> selectListByPage(CapPreApproval record) {
        return null;
    }

    @Override
    public int deleteByPrimaryKey(Object o) {
        return 0;
    }

    @Override
    public int delete(CapPreApproval capPreApproval) {
        return 0;
    }

    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return false;
    }

    @Override
    public CapPreApproval selectByPrimaryKey(Object o) {
        return null;
    }

    @Override
    public CapPreApproval selectOne(CapPreApproval capPreApproval) {
        return null;
    }

    @Override
    public int deleteByIds(String s) {
        return 0;
    }

    @Override
    public int insertList(List<CapPreApproval> list) {
        return 0;
    }

    @Override
    public int insertUseGeneratedKeys(CapPreApproval capPreApproval) {
        return 0;
    }

    @Override
    public int deleteByExample(Object o) {
        return 0;
    }

    @Override
    public List<CapPreApproval> selectByExample(Object o) {
        return null;
    }

    @Override
    public int selectCountByExample(Object o) {
        return 0;
    }

    @Override
    public CapPreApproval selectOneByExample(Object o) {
        return null;
    }

    @Override
    public int updateByExample(CapPreApproval capPreApproval, Object o) {
        return 0;
    }

    @Override
    public int updateByExampleSelective(CapPreApproval capPreApproval, Object o) {
        return 0;
    }

    @Override
    public List<CapPreApproval> selectByExampleAndRowBounds(Object o, RowBounds rowBounds) {
        return null;
    }

    @Override
    public List<CapPreApproval> selectByRowBounds(CapPreApproval capPreApproval, RowBounds rowBounds) {
        return null;
    }

    @Override
    public ReType show(CapPreApproval capPreApproval, int page, int limit) {
        return null;
    }

    @Override
    public ReType getList(CapPreApproval capPreApproval, int page, int limit) {
        return null;
    }

    @Override
    public String showAll(CapPreApproval capPreApproval) {
        return null;
    }
}
