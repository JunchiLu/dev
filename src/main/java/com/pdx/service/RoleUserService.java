package com.pdx.service;

import com.pdx.pojo.RoleUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author PDX
 * @since 2022-05-05
 */
public interface RoleUserService extends IService<RoleUser> {

    List<String> selectNameById(String id);
}
