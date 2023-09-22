package com.functionalInterface.LambdaExpression;

public class Main {

    public static void main(String[] args) {

        Inter inter=s->{
            System.out.println("from inner class using lambda "+s);
        };
        inter.SayHello("vivek");
        InterStudent interStudent=student -> {
            System.out.println(student.getRoll());
            System.out.println(student.getName());
        };
        interStudent.msg(new Student(1,"vievk",33));
    }
}
