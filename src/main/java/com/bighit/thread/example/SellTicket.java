package com.bighit.thread.example;

/**
 * @author jiangxl
 * @since 2020/8/9
 * @description 四个窗口一起卖100张tickets (共享资源)
 */

public class SellTicket {
    public static void main(String[] args) {
        Seller seller = new Seller();
        Thread window1 = new Thread(seller, "窗口1");
        Thread window2 = new Thread(seller, "窗口2");
        Thread window3 = new Thread(seller, "窗口3");
        window1.start();
        window2.start();
        window3.start();
    }
}

class Seller implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "卖了第" + ticket + "张票");
            ticket --;
        }
    }

}
