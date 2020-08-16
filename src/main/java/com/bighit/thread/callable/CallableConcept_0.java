package com.bighit.thread.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author jiangxl
 * @since 2020/8/16
 */
public class CallableConcept_0 {
    /**
     * Callable一般是配合线程池工具ExecutorService来使用的
     * ExecutorService可以使用submit方法来让一个Callable接口执行 它会返回一个Future
     */

    /**
     * FutureTask FutureTask能够在高并发环境下确保任务只执行一次
     * FutureTask是实现的RunnableFuture接口的，而RunnableFuture接口同时继承了Runnable接口和Future接口
     * public interface RunnableFuture<V> extends Runnable, Future<V>
     */

}
