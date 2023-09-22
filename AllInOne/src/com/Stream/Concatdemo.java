package com.Stream;

import com.functionalInterface.LambdaExpression.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concatdemo {


    // Intermediate-----------------
    public static void main(String[] args) {

        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"vivek",233));
        list.add(new Student(2,"kalu",523));
        list.add(new Student(3,"nelu",453));
        list.add(new Student(16,"raj",323));

        List<Student>list2=new ArrayList<>();
        list2.add(new Student(1,"vivek",233));
        list2.add(new Student(2,"kalu",523));
        list2.add(new Student(3,"nelu",453));
        list2.add(new Student(16,"raj",323));

//        System.out.println( list2.stream().filter(i->i.getMarks()>350).collect(Collectors.toList()));
//        System.out.println( list.stream().filter(i->i.getRoll()>5).collect(Collectors.toList()));
        //concat two stream-----------------------subclass of Type
        // collect into stream and print list


       Stream<Student> con= Stream.concat(list2.stream().filter(i->i.getMarks()>350),list.stream().filter(i->i.getRoll()>5));
        System.out.println(con.collect(Collectors.toList()));

    }
}
