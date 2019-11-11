package com.zengjx.demo2;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/8  20:41
 * @Version V1.0
 */
public class CashReturn extends CashSuper {
    private  double  moneyCondition=0.0d;
    private   double moneyReturn=0.0d;
    public  CashReturn(String moneyCondition,String moneyReturn)
    {
        this.moneyCondition=Double.parseDouble(moneyCondition);
        this.moneyReturn=Double.parseDouble(moneyReturn);
    }
    @Override
    public double accepetCash(double money) {
       double   ret=money;
       if(money>=moneyCondition){ //   200
           ret=money-Math.floor(money-moneyCondition)*moneyReturn;//? 为什么这么计算
       }

        return 0;//   500 -Math.Floor(money/moneyCondition)
    }
}
