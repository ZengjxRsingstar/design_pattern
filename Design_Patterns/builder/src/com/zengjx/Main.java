package com.zengjx;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/10  12:00
 * @Version V1.0
 */
//建造者模式
public class Main {
    public static void main(String[] args) {
      Builder  builder =new ConvcreteBuilder();
      Director  director =new Director();
      director.Construct(builder);
        Product product = builder.GetProduct();
        System.out.println(product.show());
    }
}
