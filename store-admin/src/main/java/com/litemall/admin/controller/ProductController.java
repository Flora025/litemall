package com.litemall.admin.controller;

import com.litemall.admin.service.ProductService;
import com.litemall.admin.utils.AliyunOSSUtils;
import com.litemall.param.ProductSaveParam;
import com.litemall.param.ProductSearchParam;
import com.litemall.pojo.Product;
import com.litemall.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

/**
 * projectName: b2c-store
 * <p>
 * description: 商品后台管理controller
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private AliyunOSSUtils aliyunOSSUtils;

    @GetMapping("list")
    public R  adminList(ProductSearchParam productSearchParam){

        return productService.search(productSearchParam);
    }

    @PostMapping("upload")
    public R  adminUpload(@RequestParam("img") MultipartFile img) throws Exception {

        String filename = img.getOriginalFilename();
        filename = UUID.randomUUID().toString().replaceAll("-","")
                +filename;
        String contentType = img.getContentType();

        byte[] content = img.getBytes();

        int hours = 1000;

        String url = aliyunOSSUtils.uploadImage(filename, content, contentType, hours);
        System.out.println("url = " + url);
        return R.ok("图片上传成功!",url);
    }


    @PostMapping("save")
    public R adminSave(ProductSaveParam productSaveParam){

        return productService.save(productSaveParam);
    }

    @PostMapping("update")
    public R adminUpdate(Product product){

        return productService.update(product);
    }

    @PostMapping("remove")
    public R adminRemove(Integer productId){

        return productService.remove(productId);
    }
}
