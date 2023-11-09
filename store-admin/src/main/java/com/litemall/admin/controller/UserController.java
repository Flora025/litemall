package com.litemall.admin.controller;

import com.litemall.admin.service.UserService;
import com.litemall.param.CartListParam;
import com.litemall.param.PageParam;
import com.litemall.pojo.User;
import com.litemall.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: b2c-store
 * <p>
 * description: 用户模块调用的controller
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("list")
    public R userList(PageParam pageParam){

        return userService.userList(pageParam);
    }

    @PostMapping("remove")
    public R userList(CartListParam pageParam){

        return userService.userRemove(pageParam);
    }

    @PostMapping("update")
    public R update(User user){

        return userService.userUpdate(user);
    }

    @PostMapping("save")
    public R save(User user){

        return userService.save(user);
    }
}
