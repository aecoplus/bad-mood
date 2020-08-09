package com.bighit.thread.example;

/**
 * @author jiangxl
 * @since 2020/8/9
 */
public class MoneyAddSubTest {
    public static void main(String[] args) {
        MoneyCard card = new MoneyCard();

        MoneyAdd addTask = new MoneyAdd(card);
        MoneySub subTask = new MoneySub(card);

        Thread addThread = new Thread(addTask, "saver");
        Thread subThread = new Thread(subTask, "suber");

        addThread.start();
        subThread.start();
    }
}
