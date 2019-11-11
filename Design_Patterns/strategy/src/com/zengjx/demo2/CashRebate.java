package com.zengjx.demo2;

/**
 * 打折收费
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/8  20:38
 * @Version V1.0
 */
public class CashRebate extends CashSuper {
  private   double  moneyRebate =1d;

    public   CashRebate(String moneyRebate){//必须传入打折率 例如 0.8
          this.moneyRebate=Double.parseDouble(moneyRebate);
    }
    @Override
    public double accepetCash(double money) {
        return money;
    }
}
