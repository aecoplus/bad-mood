package com.bighit.thread;

/**
 * @author jiangxl
 * @since 2020/8/13
 */
public class NormalMethod {
    public static void main(String[] args) {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * 1. 休眠
         * 当前线程主动休眠millis毫秒
         * public static void sleep(long millis) throws InterruptedException;
         */

        /**
         * 2. 主动放弃
         * 当前线程主动放弃时间片 回到就绪状态 竞争下一次时间片
         * public static void yield();
         */

        /**
         * 3. 加入(A等待B线程死亡后继续执行)
         *
         * public final void join();
         */
    }
}
