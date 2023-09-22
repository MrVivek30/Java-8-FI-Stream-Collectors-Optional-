package com.Stream;

import com.functionalInterface.LambdaExpression.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {
    public static void main(String[] args) {


//------------natural ordering--------------------

        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        System.out.println("The sorted stream is : ");

        // sorted in natural order-------------------
        list.stream().sorted().forEach(System.out::println);

   //------------------using comparator-------------



        List<Student>list2=new ArrayList<>();
        list2.add(new Student(1,"vivek",233));
        list2.add(new Student(2,"kalu",523));
        list2.add(new Student(3,"nelu",453));
        list2.add(new Student(8,"nelu",453));
        list2.add(new Student(4,"nelu",453));


        list2.add(new Student(16,"raj",323));

        System.out.println(list2.stream().sorted((s1,s2)->s1.getRoll()> s2.getRoll()?1:-1).collect(Collectors.toList()));
    }
}
