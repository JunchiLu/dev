package com.pdx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pdx.pojo.Goods;
import com.pdx.mapper.GoodsMapper;
import com.pdx.service.GoodsService;
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
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

    @Override
    public List<Goods> findAll() {
        return baseMapper.selectAll();
    }

    @Override
    public void addGoods(Goods goods) {
        baseMapper.addGoods(goods);
    }

    @Override
    public Goods selectById(String id) {
        return baseMapper.getById(id);
    }
}
