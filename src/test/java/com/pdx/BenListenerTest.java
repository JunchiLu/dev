package com.pdx;

import com.pdx.utils.handler.ListenerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName:BenListenerTest
 * @Author JunchiLu
 * @Date 2022/7/18
 * @Version 1.0
 */
@SpringBootTest
public class BenListenerTest {
    @Autowired
    private ListenerService listenerService;

    @Test
    public void Bentest(){
        listenerService.buyOrder("sadfasdfa");
    }
    @Test
    public void Bentests(){
        listenerService.buOrderSy("1234566");
    }


}
