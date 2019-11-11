package com.zengjx.demo1;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/8  20:28
 * @Version V1.0
 */
public class Context {
    Strategy strategy;
    public  Context (Strategy strategy){
        this.strategy=strategy;
    }

    //上下文接口
   public   void   ContextInterface() {
        strategy.AlgorithmInterface();
   }
}
