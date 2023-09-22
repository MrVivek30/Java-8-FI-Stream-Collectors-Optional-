package com.Stream;

import java.util.Arrays;
import java.util.List;

public class CountDemo {

    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,24,6,5,66576,7,89,9);


        //count of elements'---------------------
        System.out.println(list.stream().count());
    }
}
