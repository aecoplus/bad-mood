package com.bighit.thread;

/**
 * @author jiangxl
 * @since 2020/8/9
 */
public class ExtendsThread_1 {

    /**
     * 创建线程的三种方式:
     * 1. 继承Thread类 重写run方法
     * 2. 实现Runnable接口
     * 3. 实现Callable接口
     */

    public static void main(String[] args) {
        // 1. 继承Thread
        MyThread thread = new MyThread();
        // thread.setName("aeco's thread");
        // MyThread threadWithName = new MyThread("aeco's thread");
        thread.start();
    }
}


/**
 * 获取线程Id和线程名称:
 * 1. 在Thread的子类中调用this.getId() this.getName()
 * 2. 使用Thread.currentThread().getId() Thread.currentThread().getName()
 *
 * 修改线程名称:
 * 1. 调用线程对象的setName()方法
 * 2. 使用线程子类的构造方法赋值
 */

class MyThread extends Thread {
    MyThread () {}

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run (){
        System.out.println("this is thread in [MyThread] ");
        System.out.println("线程Id:" + this.getId());
        System.out.println("线程name:" + this.getName());
    }
}