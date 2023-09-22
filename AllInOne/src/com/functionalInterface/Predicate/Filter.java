package com.functionalInterface.Predicate;

import com.functionalInterface.LambdaExpression.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(10,"n1",98));
        list.add(new Student(11,"n2",68));
        list.add(new Student(12,"n3",78));
        list.add(new Student(13,"n4",88));
        list.add(new Student(14,"n5",58));


        list.removeIf(s -> s.getRoll()>12  );


        System.out.println(list);

    }
}
