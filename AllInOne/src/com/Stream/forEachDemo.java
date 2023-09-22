package com.Stream;

import com.functionalInterface.LambdaExpression.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class forEachDemo {


    //terminal-----------------------
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("one");
        al.add("one1");
        al.add("one2");
        al.add("one3");
        Stream<String> ss=al.stream();
        ss.forEach(i->System.out.println(i));

        List<Student>list=new ArrayList<>();
        list.add(new Student(1,"vivek",233));
        list.add(new Student(2,"kalu",523));
        list.add(new Student(3,"nelu",453));
        list.add(new Student(16,"raj",323));

//        list.forEach( System.out::println);
        list.stream().forEach(s-> System.out.println());

    }
}
