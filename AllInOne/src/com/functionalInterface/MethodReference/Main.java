package com.functionalInterface.MethodReference;

public class Main {

    public static void fun1(String msg){
        System.out.println("from static :"+msg);
    }

    public static void main(String[] args) {

        Inter inter=Main::fun1;
        inter.sayHello("vivek");
    }
}
