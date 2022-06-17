package com.pdx.service.impl;

import com.pdx.pojo.Category;
import com.pdx.mapper.CategoryMapper;
import com.pdx.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author PDX
 * @since 2022-05-05
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
