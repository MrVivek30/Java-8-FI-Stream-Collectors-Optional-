package com.Practice;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse_A_String {

    public static void main(String[] args) {
        String s="vivek";

       List<Character> list= s.chars().mapToObj(c->(char)c).collect(Collectors.toList());

        Collections.reverse(list);
//      String v=  list.stream()
//              .map(e->e.toString())
//              .collect(Collectors.joining());
//
//
      String v=  list.stream()
              .map(e->e.toString()).reduce((a,b)->a+b).get();

        System.out.println(v);

        int n=23;
        int c=0;
        for (int i=1;i<=n/2;i++){
            if(i%n==0){
                c++;
            }
        }
        if (c==2) System.out.println("yes");
        else System.out.println("no");
    }
}
