package com.zengjx.demo2;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/8  20:35
 * @Version V1.0
 */
public class CashContext {
 // private
    CashSuper  cashSuper =null;
    public  CashContext(String  type){
        switch (type){

            case "正常收费":
                cashSuper =new CashNormal();
            break;
            //....

        }
    }

    public  double    GetResult(){


        return  cashSuper.accepetCash(1111);
    }
}
