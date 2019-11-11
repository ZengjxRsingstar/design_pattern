package com.zengjx.demo2;

/**
 * //正常收费类
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/8  20:37
 * @Version V1.0
 */

public class CashNormal extends CashSuper {
    @Override
    public double accepetCash(double money) {
        return money;
    }
}
