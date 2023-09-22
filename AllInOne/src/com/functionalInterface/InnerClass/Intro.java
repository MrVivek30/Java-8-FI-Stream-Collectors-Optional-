package com.functionalInterface.InnerClass;

public interface Intro {
    //one abstract method------
    void sayHello(String name);
    // object class method-------
    boolean equals(Object obj);
    //default--------
    default void fun1(){
        System.out.println("from default");
    }
//    static ----------
    static void fun2(){
        System.out.println("from static");
    }

}
