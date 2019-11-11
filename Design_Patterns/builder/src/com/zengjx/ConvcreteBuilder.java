package com.zengjx;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/10  11:50
 * @Version V1.0
 */
public class ConvcreteBuilder  implements Builder {
    private   Product  product =new Product();
    @Override
    public void BuilderPart() {
        System.out.println("BuilderPart");
        BuilderPartA();
        BuilderPartB();

    }

    @Override
    public void BuilderPartA() {
        System.out.println("零件A");
        product.addParts("零件A");
    }

    @Override
    public void BuilderPartB() {
        System.out.println("零件B");
        product.addParts("零件B");
    }

    @Override
    public Product GetProduct() {
        return product;
    }

    public   String  GetResult(){
        return  product.show();
    }
}
