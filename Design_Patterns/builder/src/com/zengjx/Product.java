package com.zengjx;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/11/10  11:51
 * @Version V1.0
 */
public class Product {

    List<String> parts =new ArrayList<>();
    public   void   addParts(String  part){
        parts.add(part);
    }
    //show
    public  String   show(){
    StringBuilder  sb= new StringBuilder();
        for (int i = 0; i <parts.size() ; i++) {
            sb.append(parts.get(i));
        }
     return   sb.toString();
    }
}
