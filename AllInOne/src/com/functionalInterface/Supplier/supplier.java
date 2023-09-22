package com.functionalInterface.Supplier;

import com.functionalInterface.LambdaExpression.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class supplier {

    public static void main(String[] args) {

//when return then use {}-------------
//        Supplier<LocalDate> supplier = () -> {
//            return LocalDate.now();
//        };


//----want to remove return ---------

        // it dint take argument it return only-------
        Supplier<LocalDate>supplier1=()->LocalDate.now();
        System.out.println(supplier1.get());

        //custom--------------------
        Supplier<String>supplier2=()->"vivek";
        System.out.println(supplier2.get());

        Supplier<List<Student>>studentSupplier=()->{
          List<Student>list=new ArrayList<>();
          list.add(new Student(1,"viev",213));
          list.add(new Student(2,"ff",215));
          list.add(new Student(3,"bfb",213));
          list.add(new Student(4,"fwf",2163));
          list.add(new Student(5,"rtr",251));
          list.add(new Student(6,"qqq",218));
          return list;
        };

        System.out.println(studentSupplier.get());
    }
}
