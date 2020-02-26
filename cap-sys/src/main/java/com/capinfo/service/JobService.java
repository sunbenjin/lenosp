package com.capinfo.service;

import com.capinfo.base.BaseService;
import com.capinfo.entity.SysJob;
import com.capinfo.util.JsonUtil;

/**
 * @author zhuxiaomeng
 * @date 2018/1/6.
 * @email 154040976@qq.com
 */
public interface JobService extends BaseService<SysJob,String> {

    /**
     * 更新
     * @param job
     * @return
     */
    public boolean updateJob(SysJob job);

    /**
     * 删除
     * @param id
     * @return
     */
    public JsonUtil del(String id);

    /**
     * 启动任务
     * @param id
     * @return
     */
    public boolean startJob(String id);

    /**
     * 停止任务
     * @param id
     * @return
     */
    public boolean stopJob(String id);

}
