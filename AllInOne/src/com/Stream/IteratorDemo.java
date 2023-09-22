package com.Stream;

import com.functionalInterface.LambdaExpression.Student;

import java.util.ArrayList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {


        List<Student> list2=new ArrayList<>();
        list2.add(new Student(1,"vivek",233));
        list2.add(new Student(2,"kalu",523));
        list2.add(new Student(3,"nelu",453));
        list2.add(new Student(8,"nelu",453));
        list2.add(new Student(4,"nelu",453));

        System.out.println(list2.stream().iterator().hasNext());
        System.out.println();
    }
}
