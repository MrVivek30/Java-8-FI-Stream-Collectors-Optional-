package com.Practice;

import com.functionalInterface.LambdaExpression.Student;

import java.util.*;

public class Map_Pracrice {
    public static void main(String[] args) {
        List<Student>studentList= Arrays.asList(new Student(1,"mamu",290),new Student(2,"sonu",390),new Student(3,"ekta",490),new Student(4,"vivek",500),new Student(5,"sholey",345),new Student(6,"lalu",480),new Student(7,"kajal",380),new Student(8,"manu",235),new Student(9,"sony",431),new Student(11,"sanju",443),new Student(10,"kamlesh",332),new Student(1,"mamu",290),new Student(2,"sonu",390),new Student(3,"ekta",490),new Student(4,"vivek",500),new Student(5,"sholey",345),new Student(6,"lalu",480),new Student(7,"kajal",380),new Student(8,"manu",235),new Student(9,"sony",431),new Student(11,"sanju",443),new Student(10,"kamlesh",332));
String s1="vivek chaudhary";

Map<Character,Integer>map3=new HashMap<>();

for (int i=0;i<s1.length();i++){
    char c=s1.charAt(i);
    if (c!=' ') {
//        if (!map3.containsKey(c)) {
//            map3.put(c, 1);
//
//        } else {
//            map3.put(c, map3.get(c) + 1);
//        }

        map3.put(c,map3.getOrDefault(c,0)+1);
    }

}


        System.out.println(map3);












        Map<Integer,List<Student>> map=new HashMap<>();

        for (Student  s:studentList){

            if (s.getMarks()>380){

                List<Student>students=new ArrayList<>();
                students.add(s);
//                map.put(s.getMarks(),map.getOrDefault(students,0),students);
//
                if (!map.containsKey(s.getMarks())){
                    map.put(s.getMarks(),students);
                }else{
//                   List<Student> st = map.get(s.getMarks());
//                   st.add(s);
                   List<Student> v=map.get(s.getMarks());

                   v.add(s);
                    map.put(s.getMarks(),v);
                }
            }
        }

        map.forEach((k,v)->{

            System.out.println(k+"    "+v);
        });

    }
}
