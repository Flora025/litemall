package com.litemall.order.mapper;

import com.litemall.pojo.Order;
import com.litemall.vo.AdminOrderVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * projectName: b2c-store
 * <p>
 * description: order的数据库进行接口
 */
public interface OrderMapper extends BaseMapper<Order> {

    /**
     * 查询后台管理的数据方法
     * @param offset
     * @param pageSize
     * @return
     */
    List<AdminOrderVo> selectAdminOrder(@Param("offset") int offset, @Param("pageSize") int pageSize);
}
