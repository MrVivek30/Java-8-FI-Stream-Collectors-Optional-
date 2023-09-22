package com.Generics;

import java.util.List;

public class A {

    public static  void addNum(List<?extends Number>list){
//        list.add(1);
        for (Number n:list){
            System.out.println(n);
        }

    }


    public static void multiplyNum(List<? super Integer>list){
//        list.add(1);
    }
}
