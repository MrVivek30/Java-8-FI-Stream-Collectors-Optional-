package com.functionalInterface.LambdaExpression;

public class Main2 {

    public static void main(String[] args) {
        InterStudent interStudent=s->{
            System.out.println(s.getMarks());
            System.out.println(s.getName());
            System.out.println(s.getRoll());
        };
        interStudent.msg(new Student(1,"vivek",239));
    }
}
