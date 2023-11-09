package com.litemall.user.controller;

import com.litemall.param.CartListParam;
import com.litemall.param.PageParam;
import com.litemall.pojo.User;
import com.litemall.user.service.UserService;
import com.litemall.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: b2c-store
 * <p>
 * description: 后台管理调用的位置controller
 */
@RestController
@RequestMapping("user")
public class UserAdminController {

    @Autowired
    private UserService userService;

    @PostMapping("admin/list")
    public R listPage(@RequestBody PageParam pageParam){

        return userService.listPage(pageParam);
    }

    @PostMapping("admin/remove")
    public R remove(@RequestBody CartListParam cartListParam){

        return userService.remove(cartListParam.getUserId());
    }


    @PostMapping("admin/update")
    public R update(@RequestBody User user){

        return userService.update(user);
    }

    @PostMapping("admin/save")
    public R save(@RequestBody User user){

        return userService.save(user);
    }
}
