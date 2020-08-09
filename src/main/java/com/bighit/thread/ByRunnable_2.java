package com.bighit.thread;

/**
 * @author jiangxl
 * @since 2020/8/9
 */
public class ByRunnable {
    public static void main(String[] args) {
        // 创建Runnable对象 标识线程要执行的功能
        Runnable r = new MyRunnable();
        Thread thread = new Thread(r);
        thread.setName("threadByRunnable");
        // Thread thread = new Thread(r, "threadByRunnable");
        thread.start();
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("this is thread in [myRunnable]");
        System.out.println("当前线程Id: " + Thread.currentThread().getId());
        System.out.println("当前线程name:" + Thread.currentThread().getName());
    }
}
