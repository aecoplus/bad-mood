package com.bighit.thread.example;

import java.math.BigDecimal;

/**
 * @author jiangxl
 * @since 2020/8/9
 */
public class MoneyAdd implements Runnable {

    private MoneyCard card;

    public MoneyAdd(MoneyCard card) {
        this.card = card;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            card.setMoney(card.getMoney().add(new BigDecimal("10")));
            System.out.println(Thread.currentThread().getName() + "存了10块RMB, 当前余额:" + card.getMoney());
        }
    }
}
