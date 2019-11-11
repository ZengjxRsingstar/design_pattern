package com.zengjx.demo1;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/8  20:26
 * @Version V1.0
 */
public class ConcreteStrategyA extends   Strategy {
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法1 实现");
    }
}
