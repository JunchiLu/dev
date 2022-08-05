package com.pdx.utils.handler;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @ClassName:BenListenerUtils
 * @Author JunchiLu
 * @Date 2022/7/18
 * @Version 1.0
 */
@Slf4j
@Component
public class BenListenerUtils implements ApplicationListener<HandlerEvent> {
    @SneakyThrows
    @Override
    public void onApplicationEvent(HandlerEvent event) {
        String onderId = event.getOrderId();
        long l = System.currentTimeMillis();
        Thread.sleep(1000);
        long l1 = System.currentTimeMillis();
        System.out.println("我是同步用時："+onderId +""+ (l1-l)+"--------------");
    }
    @Async
    @SneakyThrows
    @EventListener(HandlerEvent.class)
    public void buyEven(HandlerEvent event){
        Thread.sleep(1500);
        System.out.println("我是異步的我執行了----》" + event.getOrderId());

    }
}
