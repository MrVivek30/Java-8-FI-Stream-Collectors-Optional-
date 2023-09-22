package com.functionalInterface.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Inter /*implements Consumer<String> {

    @Override
    public void accept(String s) {

    }*/

{

    public static void main(String[] args) {

        Consumer<String>consumer=t-> System.out.println(t);

        consumer.accept("vivek");

        Consumer<Integer>consumer1=t1-> System.out.println(t1*t1);

        consumer1.accept(4);

        List<Integer>list= Arrays.asList(1,3,5,6,7,8);

        Consumer<Integer>consumer2=v-> System.out.println(v);
        Consumer<Integer>consumer3=v-> System.out.println(v+v);
        Consumer<Integer>consumer5=consumer2.andThen(consumer3);
        consumer5.accept(5);
        System.out.println(consumer5);
//        BiConsumer

//        Consumer<Integer>consumer2=s-> System.out.println(s%2==0);
//        list.forEach(consumer2);

//        easy way-------------
        //consumer inside for each method--------------
//consumer will consume--------- and give some output---it did'nt return any type
        list.forEach(s-> System.out.println( s%2==0));



    }


}
