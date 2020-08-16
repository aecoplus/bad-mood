package com.bighit.thread.callable;

import java.util.concurrent.*;

/**
 * @author jiangxl
 * @since 2020/8/16
 */
public class Task_1 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 1;
    }

    /**
     * FutureTask FutureTask能够在高并发环境下确保任务只执行一次
     * FutureTask是实现的RunnableFuture接口的，而RunnableFuture接口同时继承了Runnable接口和Future接口
     * public interface RunnableFuture<V> extends Runnable, Future<V>
     */
    public void futureTask() throws Exception {
        ExecutorService executor = Executors.newCachedThreadPool();
        FutureTask<Integer> futureTask = new FutureTask(new Task_1());
        // 无返回值  submit(Runnable r)
        executor.submit(futureTask);
        // 通过futureTask取值
        System.out.println(futureTask.get());
    }

    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newCachedThreadPool();
        Task_1 task = new Task_1();
        // 有返回值 通过result取值 submit(Callable c)
        Future<Integer> result =  executor.submit(task);
        // 注意调用get方法会阻塞当前线程，直到得到结果。
        // 所以实际编码中建议使用可以设置超时时间的重载get方法。
        System.out.println(result.get());
    }
}
