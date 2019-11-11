package com.zengjx.demo2;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/8  20:57
 * @Version V1.0
 */
public class CashFactory {

CashSuper  aSuper=null;
public   static  CashSuper  createCashAcept(String type){

   CashSuper  cs =null;
   switch (type){

       case "正常收费":
           cs =new CashNormal();
       break;
       case "打8 折":
           cs=new CashRebate("0.8");
       break;
       case "满300 返100":
            cs=new CashReturn("300","100");
       break;
       default:
       break;


   }
    return   cs;
}

}
