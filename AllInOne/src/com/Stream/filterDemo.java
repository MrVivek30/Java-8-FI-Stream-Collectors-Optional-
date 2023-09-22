package com.Stream;

import com.functionalInterface.LambdaExpression.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo {
    //intermediate-------------------------
    public static void main(String[] args) {

        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"vivek",233));
        list.add(new Student(2,"kalu",523));
        list.add(new Student(3,"nelu",453));
        list.add(new Student(16,"raj",323));
//jiska odd hai uska nam pin kro bs
        list.stream().filter(i->i.getRoll()%2==1).forEach(s-> System.out.println(s.getName()));

//another List of Student whose marks is greater than 800 from a List of Student

        System.out.println(  list.stream().filter(i->i.getMarks()>300).collect(Collectors.toList()));
    }
}
