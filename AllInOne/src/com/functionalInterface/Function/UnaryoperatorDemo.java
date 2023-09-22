package com.functionalInterface.Function;

import java.util.function.UnaryOperator;

public class UnaryoperatorDemo {

    public static void main(String[] args) {

        UnaryOperator<Integer>unaryOperator=UnaryOperator.identity();
        System.out.println( unaryOperator.apply(12));
    }
}
