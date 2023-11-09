package com.litemall.admin.service;

import com.litemall.param.ProductSaveParam;
import com.litemall.param.ProductSearchParam;
import com.litemall.pojo.Product;
import com.litemall.utils.R;

/**
 * projectName: b2c-store
 * <p>
 * description:
 */
public interface ProductService {

    /**
     * 全部商品查询和搜索查询的方法
     * @param productSearchParam
     * @return
     */
    R search(ProductSearchParam productSearchParam);

    /**
     * 进行商品数据保存
     * @param productSaveParam
     * @return
     */
    R save(ProductSaveParam productSaveParam);

    /**
     * 更新商品数据
     * @param product
     * @return
     */
    R update(Product product);

    /**
     * 商品移除功能
     * @param productId
     * @return
     */
    R remove(Integer productId);
}
