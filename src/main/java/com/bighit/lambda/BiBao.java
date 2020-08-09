package com.bighit.lambda;

import java.util.function.Supplier;

/**
 * @author jiangxl
 * @since 2020/8/9
 * 闭包
 */
public class BiBao {
    public static void main(String[] args) {
        Integer num = getNum().get();
        System.out.println(num);
    }


    private static Supplier<Integer> getNum() {
        final int num = 7;
        // 闭包 提升变量num的声明周期
        return () -> num;
        // variable used in lambda expression should be final.
    }

}
