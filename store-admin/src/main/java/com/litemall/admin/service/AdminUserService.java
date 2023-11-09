package com.litemall.admin.service;

import com.litemall.admin.param.AdminUserParam;
import com.litemall.admin.pojo.AdminUser;

/**
 * projectName: b2c-store
 * <p>
 * description:
 */
public interface AdminUserService {

    /**
     * 登录业务方法
     * @param adminUserParam
     * @return
     */
    AdminUser login(AdminUserParam adminUserParam);
}
