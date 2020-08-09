package com.bighit.thread.example;

import java.math.BigDecimal;

/**
 * @author jiangxl
 * @since 2020/8/9
 */
public class MoneySub implements Runnable {

    private MoneyCard card;

    public MoneySub(MoneyCard card) {
        this.card = card;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (card.getMoney().compareTo(new BigDecimal("10")) < 0) {
                System.out.println("余额不足");
                i --;
            } else {
                card.setMoney(card.getMoney().subtract(new BigDecimal("10")));
                System.out.println(Thread.currentThread().getName() + "取了10,当前余额为:" + card.getMoney());
            }
        }
    }
}
