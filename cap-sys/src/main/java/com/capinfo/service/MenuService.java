package com.capinfo.service;

import com.alibaba.fastjson.JSONArray;
import com.capinfo.base.BaseService;
import com.capinfo.entity.SysMenu;
import com.capinfo.util.JsonUtil;

import java.util.List;

/**
 * @author zhuxiaomeng
 * @date 2017/12/12.
 * @email 154040976@qq.com
 */
public interface MenuService extends BaseService<SysMenu,String> {

  List<SysMenu> getMenuNotSuper();

  @Override
  int insert(SysMenu menu);


  List<SysMenu> getMenuChildren(String id);

  public JSONArray getMenuJsonList();

  List<SysMenu> getMenuChildrenAll(String id);

  public JSONArray getTreeUtil(String roleId);

  List<SysMenu> getUserMenu(String id);

  public JSONArray getMenuJsonByUser(List<SysMenu> menuList);

  public JsonUtil del(String id);

}
