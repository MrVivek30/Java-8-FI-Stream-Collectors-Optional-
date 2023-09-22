package com.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningDemo {
    public static void main(String[] args) {
        List<Character> ch = Arrays.asList(
                'v', 'i', 'v', 'e', 'k', 'c', 'h', 'a', 'u',
                'd', 'h', 'a', 'r','y');

        //------normal array--------------

        char[] chacha = {  'v', 'i', 'v', 'e', 'k', 'c', 'h', 'a', 'u',
                'd', 'h', 'a', 'r','y' };

       String v= Stream.of(chacha).map(a->new String(a)).collect(Collectors.joining());
        System.out.println(v);

//        joining character-------------------------
//                                              String ::valueOf
        System.out.println( ch.stream().map(s-> String.valueOf(s)).collect(Collectors.joining()));


        //----------joining--delimiter-------------------

        List<String>stringList=Arrays.asList("ram","shyam","karan","rahim","karim");

//        System.out.println(stringList.stream().collect(Collectors.joining(", ")));



        System.out.println(stringList.stream().collect(Collectors.joining(",","{","}")));

    }
}
