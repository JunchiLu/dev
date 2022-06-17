package com.pdx.service;

import com.pdx.pojo.Goods;
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
public interface GoodsService extends IService<Goods> {

    List<Goods> findAll();

    void addGoods(Goods goods);

    Goods selectById(String id);
}
