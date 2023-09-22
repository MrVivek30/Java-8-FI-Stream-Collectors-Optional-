package com.functionalInterface.Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<String,Integer> function=t->t.length();
        System.out.println(function.apply("vivek"));

       Function<Integer,String>f2=t->{
            if (t%2==0){
                return "Number is even :"+t;
            }else {
                return "numer is odd :"+t;
            }
       } ;
        System.out.println(f2.apply(4));
//        BiFunction

    }
}
