package com.pdx.test;

/**
 * @ClassName:TestOff
 * @Author JunchiLu
 * @Date 2022/7/7
 * @Version 1.0
 */
public class TestOff {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new TestThreadOff());
        thread.start();
        Thread.sleep(10000);
        System.out.println(OffOn.off);
    }
}
/**
 * @ClassName:TestOff
 * @Author JunchiLu
 * @Date 2022/7/7
 * @Version 1.0
 */