package com.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        A a=new A();
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        List<Double>list1= Arrays.asList(2.1,23.2,12.2,32.0);
        A.addNum(list1);
        A.addNum(list);

    }
}
