package com.bighit.thread.example;

import java.math.BigDecimal;

/**
 * @author jiangxl
 * @since 2020/8/9
 */
public class MoneyCard {
    private BigDecimal money = new BigDecimal("0.00");

    public BigDecimal getMoney() {
        return this.money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
