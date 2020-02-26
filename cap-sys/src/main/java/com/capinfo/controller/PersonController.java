package com.capinfo.controller;

import com.capinfo.base.CurrentUser;
import com.capinfo.core.annotation.Log;
import com.capinfo.core.shiro.Principal;
import com.capinfo.entity.SysUser;
import com.capinfo.service.SysUserService;
import com.capinfo.util.BeanUtil;
import com.capinfo.util.Checkbox;
import com.capinfo.util.JsonUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zhuxiaomeng
 * @date 2019-04-05.
 * @email 154040976@qq.com
 */
@Controller
@RequestMapping("/person")
@Api(value = "个人业务",description="个人业务处理")
public class PersonController {

    @Autowired
    SysUserService userService;

    @GetMapping()
    public String toPerson(Model model) {
        CurrentUser principal = Principal.getPrincipal();
        if (principal == null) {
            return "/login";
        }
        String id = principal.getId();

        List<Checkbox> checkboxList = userService.getUserRoleByJson(id);
        SysUser user = userService.selectByPrimaryKey(id);
        model.addAttribute("user", user);
        return "/system/person/me";
    }

    @ApiOperation(value = "/updateUser", httpMethod = "POST", notes = "更新用户")
    @Log(desc = "更新用户", type = Log.LOG_TYPE.UPDATE)
    @PostMapping(value = "updateUser")
    @ResponseBody
    public JsonUtil updatePerson(SysUser user) {
        JsonUtil jsonUtil = new JsonUtil();
        jsonUtil.setFlag(false);
        if (user == null) {
            jsonUtil.setMsg("获取数据失败");
            return jsonUtil;
        }
        SysUser oldUser = userService.selectByPrimaryKey(user.getId());
        BeanUtil.copyNotNullBean(user, oldUser);
        userService.updateByPrimaryKeySelective(oldUser);
        jsonUtil.setFlag(true);
        jsonUtil.setMsg("修改成功");
        userService.updateCurrent(user);
        return jsonUtil;
    }
}
