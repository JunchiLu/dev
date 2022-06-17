package com.pdx.service.impl;

import com.pdx.pojo.Role;
import com.pdx.mapper.RoleMapper;
import com.pdx.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    @Override
    public List<String> selectByIds(List<String> ids) {
        List<String> list = baseMapper.selectRoleNameByIds(ids);
        return list;
    }
}
