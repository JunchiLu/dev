package com.pdx.utils.handler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @ClassName:ListenerService
 * @Author JunchiLu
 * @Date 2022/7/18
 * @Version 1.0
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ListenerService {
    private final ApplicationContext applicationContext;

    public String buyOrder(String orderId){
        long l = System.currentTimeMillis();
        applicationContext.publishEvent(new HandlerEvent(this,orderId));
        long l1 = System.currentTimeMillis();
        System.out.println("-->"+(l1-l));
        return "發送成功";
    }


    public String buOrderSy(String orderId){
        System.out.println("service啓動了");
        applicationContext.publishEvent(new HandlerEvent(this,orderId));
        System.out.println("我是異步最後執行的");

        return "fasong";








    }
}
