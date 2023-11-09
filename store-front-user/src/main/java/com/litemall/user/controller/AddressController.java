package com.litemall.user.controller;

import com.litemall.param.AddressListParam;
import com.litemall.param.AddressParam;
import com.litemall.param.AddressRemoveParam;
import com.litemall.pojo.Address;
import com.litemall.user.service.AddressService;
import com.litemall.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * projectName: b2c-store
 * <p>
 * description: 地址的控制controller
 */
@RestController
@RequestMapping("user/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("list")
    public R list(@RequestBody @Validated AddressListParam addressListParam, BindingResult result){

        if (result.hasErrors()){

            return R.fail("参数异常,查询失败!");
        }

        return  addressService.list(addressListParam.getUserId());
    }


    @PostMapping("save")
    public R save(@RequestBody @Validated AddressParam addressParam, BindingResult result){

        if (result.hasErrors()){

            return R.fail("参数异常,保存失败!");
        }

        Address address = addressParam.getAdd();
        address.setUserId(addressParam.getUserId());

        return addressService.save(address);
    }

    @PostMapping("remove")
    public R remove(@RequestBody @Validated AddressRemoveParam addressRemoveParam,BindingResult result){

        if (result.hasErrors()){

            return R.fail("参数异常,删除失败!");
        }

        return addressService.remove(addressRemoveParam.getId());
    }
}

