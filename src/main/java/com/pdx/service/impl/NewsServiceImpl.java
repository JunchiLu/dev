package com.pdx.service.impl;

import com.pdx.pojo.News;
import com.pdx.mapper.NewsMapper;
import com.pdx.service.NewsService;
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
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements NewsService {

}
