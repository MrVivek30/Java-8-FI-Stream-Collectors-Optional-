package com.functionalInterface.InnerClass;

public class Main {
    public static void main(String[] args) {
        //innerclass------------
        Inter inter=new Inter() {
            @Override
            public void sayHello(String msg) {
                System.out.println("hey i am :"+msg);
            }

        };
        inter.sayHello("vivek");
    }
}
