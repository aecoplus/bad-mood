package com.bighit.thread.threadpool;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author jiangxl
 * @since 2020/8/16
 * ThreadPoolExecutor的策略
 */
public class Strategy {
    /**
     * ThreadPoolExecutor类中定义了一个volatile int变量runState来表示线程池的状态
     * 1. RUNNING
     *      线程池创建后处于RUNNING状态
     * 2. SHURDOWN
     *      调用shutdown()方法后处于SHUTDOWN状态，线程池不能接受新的任务，清除一些空闲worker,会等待阻塞队列的任务完成。
     * 3. STOP
     *      调用shutdownNow()方法后处于STOP状态，线程池不能接受新的任务，中断所有线程，阻塞队列中没有被执行的任务全部丢弃
     *      此时,poolsize=0,阻塞队列的size也为0
     * 4. TIDYING (译: 使整洁)
     *      当所有的任务已终止，ctl记录的”任务数量”为0，线程池会变为TIDYING状态。接着会执行terminated()函数。
     *      (ThreadPoolExecutor中有一个控制状态的属性叫ctl，它是一个AtomicInteger类型的变量)
     * 5. TERMINATED
     *      线程池处在TIDYING状态时，执行完terminated()方法之后，就会由 TIDYING -> TERMINATED， 线程池被设置为TERMINATED状态。
     */

    /**
     * 线程池主要的任务处理流程:
     *
     */
    public static void main(String[] args) {

    }
}
