package com.pdx.mapper;

import com.pdx.pojo.News;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author PDX
 * @since 2022-05-05
 */
@Mapper
public interface NewsMapper extends BaseMapper<News> {

}
