package com.pdx.service.impl;

import com.pdx.pojo.RoleUser;
import com.pdx.mapper.RoleUserMapper;
import com.pdx.service.RoleService;
import com.pdx.service.RoleUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author PDX
 * @since 2022-05-05
 */
@Service
public class RoleUserServiceImpl extends ServiceImpl<RoleUserMapper, RoleUser> implements RoleUserService {

    @Autowired
    private RoleService roleService;

    @Override
    public List<String> selectNameById(String id) {
        List<String> ids = baseMapper.selectRoleIdsByUserId(id);
        if (ids.size() == 0 || ids == null){
            return null;
        }
        List<String> list = roleService.selectByIds(ids);
        return list;
    }
}
