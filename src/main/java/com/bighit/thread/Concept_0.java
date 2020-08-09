package com.bighit.thread;

/**
 * @author jiangxl
 * @since 2020/8/9
 */
public class Concept_0 {
    /**
     * 进程(process)是操作系统资源分配的基本单位 线程是CPU的基本调度单位
     * 进程间不能共享数据段地址 但是同进程的线程间可以
     */

    /**
     * 线程的基本组成部分:
     *  1. CUP时间片: OS会为每一个线程分配执行时间
     *  2.运行数据:
     *      堆空间: 存储线程使用的对象 多个线程可以共享堆中的对象
     *      栈空间: 存储线程使用的局部对象 每个线程都拥有独立的栈
     *  3. 线程执行的逻辑代码
     */

    /**
     * 线程的特点:
     * 1. 线程抢占式执行: 效率高 可防止单一线程长时间占用CPU
     * 2. 在单核CPU中, 宏观上同时执行 微观上顺序执行
     */
}
