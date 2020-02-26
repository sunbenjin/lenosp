package com.capinfo.service;

import com.capinfo.base.BaseService;
import com.capinfo.entity.ActAssignee;
import org.activiti.engine.impl.pvm.process.ActivityImpl;

import java.util.List;

/**
 * @author zhuxiaomeng
 * @date 2018/1/23.
 * @email 154040976@qq.com
 */
public interface ActAssigneeService extends BaseService<ActAssignee,String> {
  int deleteByNodeId(String nodeId);

  public List<ActivityImpl> getActivityList(String deploymentId);

  public  List<ActivityImpl> selectAllActivity(List<ActivityImpl> activities);

}
