package com.bighit.thread.threadpool;

import java.util.concurrent.*;

/**
 * @author jiangxl
 * @since 2020/8/16
 */
public class ThreadPool {
    /**
     * Java中的线程池顶层接口是Executor接口，ThreadPoolExecutor是这个接口的实现类
     */

    /**
     * 线程池的构造方法 (重载)
     * public ThreadPoolExecutor(int corePoolSize,
     *                               int maximumPoolSize,
     *                               long keepAliveTime,
     *                               TimeUnit unit,
     *                               BlockingQueue<Runnable> workQueue,
     *                               ThreadFactory threadFactory,
     *                               RejectedExecutionHandler handler)
     * 1. corePoolSize: 该线程池中核心线程数最大值
     *   核心线程：线程池中有两类线程，核心线程和非核心线程。核心线程默认情况下会一直存在于线程池中，即使这个核心线程什么都不干（铁饭碗）
     *   非核心线程如果长时间的闲置，就会被销毁（临时工）。
     * 2. maximumPoolSize: 该线程池中线程总数最大值
     *   该值等于核心线程数量 + 非核心线程数量
     * 3. keepAliveTime: 非核心线程闲置超时时长
     *   非核心线程如果处于闲置状态超过该值，就会被销毁。如果设置allowCoreThreadTimeOut(true)，则会也作用于核心线程。
     * 4. unit: keepAliveTime的单位
     *   TimeUnit是一个枚举类型
     * 5. workQueue: 阻塞队列，维护着等待执行的Runnable任务对象
     *    常用的几个阻塞队列：
     *      LinkedBlockingQueue: 链式阻塞队列，底层数据结构是链表，默认大小是Integer.MAX_VALUE，也可以指定大小。
     *      ArrayBlockingQueue: 数组阻塞队列，底层数据结构是数组，需要指定队列的大小。
     *      SynchronousQueue: 同步队列，内部容量为0，每个put操作必须等待一个take操作，反之亦然。
     *      DelayQueue: 延迟队列，该队列中的元素只有当其指定的延迟时间到了，才能够从队列中获取到该元素 。
     * 6. threadFactory  创建线程的工厂
     *   用于批量创建线程，统一在创建线程时设置一些参数，如是否守护线程、线程的优先级等。如果不指定，会新建一个默认的线程工厂。
     * 7. handler  拒绝处理策略
     *   线程数量大于最大线程数就会采用拒绝处理策略，四种拒绝处理的策略为:
     *    ThreadPoolExecutor.AbortPolicy：默认拒绝处理策略，丢弃任务并抛出RejectedExecutionException异常。
     *    ThreadPoolExecutor.DiscardPolicy：丢弃新来的任务，但是不抛出异常。
     *    ThreadPoolExecutor.DiscardOldestPolicy：丢弃队列头部（最旧的）的任务，然后重新尝试执行程序（如果再次失败，重复此过程）。
     *    ThreadPoolExecutor.CallerRunsPolicy：由调用线程处理该任务。
     */

    public ThreadPool() {

    }

    public void addTask() {

    }


}
