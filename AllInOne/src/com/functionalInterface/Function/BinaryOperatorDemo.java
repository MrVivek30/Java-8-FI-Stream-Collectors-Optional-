package com.functionalInterface.Function;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {

    //--------------BinaryOperator----------minBy()
        Comparator<Integer>integerComparator=Comparator.naturalOrder();
        BinaryOperator<Integer>integerBinaryOperator=BinaryOperator.minBy(integerComparator);
        int a=12;
        int b=19;

        System.out.println(integerBinaryOperator.apply(a,b));


        //===========maxBy----------------------------

        Comparator<Integer>integerComparator2=Comparator.naturalOrder();
        BinaryOperator<Integer>integerBinaryOperator2=BinaryOperator.maxBy(integerComparator2);
        int a2=12;
        int b2=19;

        System.out.println(integerBinaryOperator2.apply(a2,b2));

    }
}
