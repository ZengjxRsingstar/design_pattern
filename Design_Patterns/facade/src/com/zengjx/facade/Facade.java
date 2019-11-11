package com.zengjx.facade;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/9  13:34
 * @Version V1.0
 */

/**
 * 外观类，它 需要了解所有的子系统的方法或者属性，进行组合，以备外界调用。
 *
 * 依赖倒装原则
 * 迪米特法则
 */
public class Facade {

  private   SubSystemOne  one ;
  private  SubSystemTwo   two;
  private  SubSystemThree three;

    public Facade() {

        one= new SubSystemOne();
        two =new SubSystemTwo();
        three =new SubSystemThree();
    }



    @Override
    public String toString() {
        return "Facade{" +
                "one=" + one +
                ", two=" + two +
                ", four=" + three +
                '}';
    }

    public   void  MethodA()
    {
     one.MethodOne();
     two.MethoddTwo();
     three.MethodThree();
    }
    public   void  MethodB()
    {
        one.MethodOne();
        two.MethoddTwo();
        three.MethodThree();
    }

}
