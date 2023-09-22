package com.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

    //intermediate-------------------
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("ramesh");
        al.add("suresh");
        al.add("mukesh");
        al.add("ajay");

        //mappig welcome to each candidates------------
        System.out.println(al.stream().map(i->"welcome :"+i).collect(Collectors.toList()));


//Example: getting List of Uppercase String from the List of lowercase string:----------

        List<String> citiesL= Arrays.asList("delhi","mumbai","chennai","kolkata");


        System.out.println(     citiesL.stream().map(i->i.toUpperCase()).collect(Collectors.toList()));

    }
}
