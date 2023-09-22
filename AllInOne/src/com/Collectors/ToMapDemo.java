package com.Collectors;

import com.functionalInterface.LambdaExpression.Student;

import java.util.*;
import java.util.stream.Collectors;

public class ToMapDemo {


    public static void main(String[] args) {

        List<Student>studentList= Arrays.asList(new Student(1,"vivek",133),new Student(2,"kamelsh",547),new Student(3,"ssonue",532));

//        -------- duplicate list------
        List<Student>studentList2= Arrays.asList(new Student(1,"vivek",133),new Student(2,"kamelsh",547),new Student(3,"ssonue",532),new Student(2,"kamelsh",547),new Student(3,"ssonue",532));

//Basic-----------------------------
       Map<String,Integer> map=  studentList.stream().
               collect(Collectors.
           toMap(Student::getName,Student::getMarks ));
        System.out.println(map);

        //------------------------with merge which  encounter duplicate

        Map<String,Integer> map1=  studentList2.stream().
                collect(Collectors.
                        toMap(Student::getName,Student::getMarks ,(s1,s2)-> s1*s2));
        System.out.println(map1);

//toMap() Method with Supplier and Merge Function:-------------

        Map<String,Integer> map2=  studentList2.stream().
                collect(Collectors.
                        toMap(Student::getName,Student::getMarks ,(s1,s2)-> s1+s2, LinkedHashMap::new));
        System.out.println(map1);
//These variants of Collectors.toMap() give you the flexibility to
// handle different scenarios when collecting elements from a stream into a map.
    }
}
