package com.bighit.thread;

/**
 * @author jiangxl
 * @since 2020/8/9
 * @description 线程的基本状态:
 *      1. 初始状态(new)      只存在堆内存中, 与常规对象无异
 *      2. 就绪状态(ready)    调用start()后 进入就绪状态 等待OS选中 并分配时间片
 *      3. 运行状态(running)  获得时间片后进入运行状态 时间片到期后 又进入就绪状态
 *      4. 终止状态(terminated) 主线程main或独立线程run()结束 进入终止状态 并释放持有的时间片
 */
public class ThreadStatus_3 {
}
