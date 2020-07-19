package com.wk.controller;

import com.wk.annotation.AspectAnnotation;
import com.wk.entity.UserPojo;
import com.wk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @author Wangkun
 * @date 2020/7/16
 * @description
 **/
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询全部用户
     *
     * @param model
     * @return
     */
    @GetMapping("queryAll")
    public String queryAll(Model model) {
        List<UserPojo> userEntityList = userService.selectAll();
        model.addAttribute("list", userEntityList);
        return "index";
    }

    /**
     * 跳转添加页面
     *
     * @return
     */
    @AspectAnnotation(operationDescription = "跳转添加页面",remark = "用于跳转到添加页面")
    @GetMapping("add")
    public String add() {
        return "add";
    }

    /**
     * 添加新用户
     * @param userPojo
     * @param model
     * @return
     */
    @AspectAnnotation(operationDescription = "添加用户",remark = "添加了一个用户")
    @PostMapping("addUser")
    public String addUser(UserPojo userPojo, Model model) {
        userPojo.setCreatdate(new Date());
        userPojo.setStatus(1);
        int insert = userService.insert(userPojo);
        return this.queryAll(model);
    }

    /**
     * 根据id删除用户
     *
     * @param id
     * @return
     */
    @AspectAnnotation(operationDescription = "删除用户",remark = "删除了一个用户")
    @GetMapping("del")
    public String del(@RequestParam("id") final Integer id, Model model) {
        int i = userService.deleteByPrimaryKey(id);
        return this.queryAll(model);
    }

    /**
     * 修改回显查询数据
     */
    @AspectAnnotation(operationDescription = "修改回显",remark = "在修改页面回显了要修改的用户信息")
    @GetMapping("updSel")
    public String updSel(@RequestParam("id") final Integer id,Model model){
        UserPojo userPojo = userService.selectByPrimaryKey(id);
        model.addAttribute("user",userPojo);
        return "upd";
    }

    /**
     * 提交修改后数据
     * @return
     */
    @AspectAnnotation(operationDescription = "修改用户",remark = "修改了一个用户")
    @PostMapping("upd")
    public String upd(UserPojo userPojo,Model model){
        userPojo.setCreatdate(new Date());
        userService.updateByPrimaryKey(userPojo);
        return this.queryAll(model);
    }
}
