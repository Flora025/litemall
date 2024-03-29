package com.litemall.order.service;

import com.litemall.param.OrderParam;
import com.litemall.param.PageParam;
import com.litemall.pojo.Order;
import com.litemall.utils.R;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * projectName: b2c-store
 * <p>
 * description:
 */
public interface OrderService extends IService<Order> {


    /**
     * 进行订单数据保存业务
     * @param orderParam
     * @return
     */
    R save(OrderParam orderParam);

    /**
     * 分组查询订单数据
     * @param userId
     * @return
     */
    R list(Integer userId);

    /**
     * 检查订单中是否有商品引用
     * @param productId
     * @return
     */
    R check(Integer productId);

    /**
     * 后台管理查询订单数据
     * @param pageParam
     * @return
     */
    R adminList(PageParam pageParam);
}
