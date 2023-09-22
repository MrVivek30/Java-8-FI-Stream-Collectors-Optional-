package com.functionalInterface.Custom;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        MyFunctionalInterface<Integer> myFunctionalInterface = (t1,t2) -> t1*t2;

        System.out.println(myFunctionalInterface.myMethod(12,34));

//        Optional<>
    }
}
