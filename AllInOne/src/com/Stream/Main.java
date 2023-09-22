package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        List<Integer>list= Arrays.asList(1,2,3,4,6,8,3);

       List<Integer> lis2=list.stream().filter(s->s%2==0).collect(Collectors.toList());

        System.out.println(lis2);
    }
}
