package com.zengjx.demo1;

/**
 * 策略模式
 * @ClassName Main
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/8  20:32
 * @Version V1.0
 */

public class Main {
    public static void main(String[] args) {
        Context context =new Context(new ConcreteStrategyA());
        context.ContextInterface();
    }
}
