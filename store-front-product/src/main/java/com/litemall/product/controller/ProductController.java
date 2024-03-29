package com.litemall.product.controller;

import com.litemall.param.*;
import com.litemall.pojo.Product;
import com.litemall.product.service.ProductService;
import com.litemall.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * projectName: b2c-store
 * <p>
 * description: 商品模块controller
 */
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/promo")
    public R promo(@RequestBody @Validated ProductPromoParam productPromoParam, BindingResult result){

        if (result.hasErrors()){
            return R.fail("数据查询失败!");
        }

        return  productService.promo(productPromoParam.getCategoryName());
    }


    @PostMapping("hots")
    public R hots(@RequestBody @Validated ProductHotParam productHotParam,BindingResult result){

        if (result.hasErrors()){
            return R.fail("数据查询失败!");
        }

        return productService.hots(productHotParam);
    }

    @PostMapping("category/list")
    public R clist(){

        return productService.clist();
    }

    @PostMapping("bycategory")
    public R byCategory(@RequestBody @Validated ProductIdsParam productIdsParam,BindingResult result){

        if (result.hasErrors()){
            return R.fail("类别商品查询失败!");
        }

        return productService.byCategory(productIdsParam);
    }


    @PostMapping("all")
    public R all(@RequestBody @Validated ProductIdsParam productIdsParam,BindingResult result){

        if (result.hasErrors()){
            return R.fail("类别商品查询失败!");
        }

        return productService.byCategory(productIdsParam);
    }


    @PostMapping("detail")
    public R detail(@RequestBody @Validated ProductIdParam productIdParam,BindingResult result){

        if (result.hasErrors()) {
            return R.fail("商品详情查询失败");
        }
        return productService.detail(productIdParam.getProductID());
    }

    @PostMapping("pictures")
    public R pictures(@RequestBody @Validated ProductIdParam productIdParam,BindingResult result){

        if (result.hasErrors()) {
            return R.fail("商品图片详情查询失败");
        }
        return productService.pictures(productIdParam.getProductID());
    }

    @PostMapping("search")
    public R search(@RequestBody ProductSearchParam productSearchParam){

        return productService.search(productSearchParam);
    }

}
