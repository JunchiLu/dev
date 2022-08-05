package com.pdx.test;

/**
 * @ClassName:TestThreadOff
 * @Author JunchiLu
 * @Date 2022/7/7
 * @Version 1.0
 */
public class TestThreadOff implements Runnable {
    @Override
    public void run() {
        System.out.println("我启动了设置为true");OffOn.setOff(true);
    }
}
/**
 * @ClassName:TestThreadOff
 * @Author JunchiLu
 * @Date 2022/7/7
 * @Version 1.0
 */