package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class forEachOrdered {


    //terminal-----------------------

    public static void main(String[] args) {


//        eg1---------------------------------------

//        // Creating a list of Integers
//        List<Integer> list = Arrays.asList(10, 19, 20, 1, 2);
//
//        // Using forEachOrdered(Consumer action) to
//        // print the elements of stream in encounter order
//        list.stream().forEachOrdered(System.out::println);

//        eg2-------------------------------------

        String str = "Vivek Chaudhary";
        System.out.println("****forEach without using parallel****");
        str.chars().forEach(s -> System.out.print((char) s));
        System.out.println("\n****forEach with using parallel****");

        str.chars().parallel().forEach(s -> System.out.print((char) s));
        System.out.println("\n****forEachOrdered with using parallel****");

        str.chars().parallel().forEachOrdered(s -> System.out.print((char) s));


//     IntStream ch =str.chars();
//
//         ch.collect(Collectors.groupingBy(v ->v));
//        System.out.println(ch+"*******************");
//
//****forEach with using parallel****
//
//        kivev audhyrcha
//
//****forEachOrdered with using parallel****
//
//        vivek chaudhary

//chars----inStream
//        maptoobj---Object
        Map<Character, Long> map = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        v -> v,Collectors.counting()));
        System.out.println(map);

        Long max= 0L;
  for(Map.Entry<Character,Long>m:map.entrySet()){
      if (m.getKey()!=' '){
      if(m.getValue()>max){
          max=m.getValue();
      }}
  }
  Character v = null;
        for(Map.Entry<Character,Long>m:map.entrySet()){
            if(m.getValue()==max){
                v=m.getKey();
            }
        }
        System.out.println(v);

//    char[]arr=    str.toCharArray();
        IntStream.range(0,str.length()-1).mapToObj(i -> str.charAt(i)).collect(Collectors.toList());



    }

}
