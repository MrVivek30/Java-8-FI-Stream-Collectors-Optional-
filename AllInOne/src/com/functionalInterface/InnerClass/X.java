package com.functionalInterface.InnerClass;

public class X implements Intro {
    @Override
    public void sayHello(String name) {
        System.out.println("Welcome "+name);
    }

    public static void main(String[] args) {

        Intro intro=new X();
        intro.sayHello("vivek");
        intro.fun1();
        Intro.fun2();

    }
}
