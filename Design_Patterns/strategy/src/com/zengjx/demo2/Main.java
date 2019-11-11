package com.zengjx.demo2;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/8  21:19
 * @Version V1.0
 * 一系类算法的方法都是相同的工作只是实现不一样。
 *  定义了一系列的可供重用的算法或者行为
 *
 *
 *
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        CashContext  cashContext = new CashContext("正常收费");
        double getResult = cashContext.GetResult();

    }
}
