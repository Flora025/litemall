package com.litemall.admin.service;

import com.litemall.param.PageParam;
import com.litemall.utils.R;

/**
 * projectName: b2c-store
 * <p>
 * description:
 */
public interface OrderService {

    /**
     * 查询订单数据
     * @param pageParam
     * @return
     */
    R list(PageParam pageParam);
}
