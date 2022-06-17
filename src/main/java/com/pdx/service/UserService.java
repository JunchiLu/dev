package com.pdx.service;

import com.pdx.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author PDX
 * @since 2022-05-05
 */
public interface UserService extends IService<User> {

    /**
     * 登录逻辑
     * @param username
     * @param password
     * @return
     */
    User login(String username, String password);

    boolean updateByUserId(User user);
}
