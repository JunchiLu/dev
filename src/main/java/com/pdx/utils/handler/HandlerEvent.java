package com.pdx.utils.handler;

import lombok.Data;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

/**
 * @ClassName:handlerEvent
 * @Author JunchiLu
 * @Date 2022/7/18
 * @Version 1.0
 */
@Data
@ToString
public class HandlerEvent extends ApplicationEvent {
    private String orderId;

    public HandlerEvent(Object source, String orderId) {
        super(source);
        this.orderId = orderId;
    }

}
