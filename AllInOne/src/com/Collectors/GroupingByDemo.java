package com.Collectors;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByDemo {
    public static void main(String[] args) {


        List<String>list= Arrays.asList("vivek","raj","kalu","kalu","vivek","kamlesh","shinu","minu");
// simialr as map--------
        //advantage is that if we dont know return type of data then we use this and print in grouping------

        System.out.println("from stream grouping:::: "+list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors
                .counting())));

        Map<String,Integer>map=new HashMap<>();

        for (String s:list){
            map.put(s,map.getOrDefault(s,0)+1);

        }
        System.out.println("from map------- "+map);

        //-------------------

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 30));
        people.add(new Person("David", 28));
        people.add(new Person("Eve", 25));

        // Group people by age using groupingBy                                                s->s.getAge()
        Map<Integer, List<Person>> peopleByAge = people.stream() .collect(Collectors.groupingBy(Person::getAge));
       
        // Print the groups
        for (Map.Entry<Integer, List<Person>> entry : peopleByAge.entrySet()) {
            System.out.println("Age " + entry.getKey() + ": " + entry.getValue());


        }

//        System.out.println(people.stream().collect(Collectors.groupingBy()));
    }
}



class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}
