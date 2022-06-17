package com.pdx.mapper;

import com.pdx.pojo.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author PDX
 * @since 2022-05-05
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

    List<String> selectRoleNameByIds(List<String> ids);
}
