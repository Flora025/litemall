package com.litemall.search.service;

import com.litemall.param.ProductSearchParam;
import com.litemall.pojo.Product;
import com.litemall.utils.R;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

/**
 * projectName: b2c-store
 * <p>
 * description:
 */
public interface SearchService {

    /**
     * 根据关键字和分页进行数据库数据查询
     * @param productSearchParam
     * @return
     */
    R search(ProductSearchParam productSearchParam);

    /**
     * 商品同步 : 插入和更新
     * @param product
     * @return
     */
    R save(Product product) throws IOException;

    /**
     * 进行es库的商品删除
     * @param productId
     * @return
     */
    R remove(Integer productId) throws IOException;
}
