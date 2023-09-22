package com.functionalInterface.Predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        //1st------------
        Predicate<String>predicate=t->t.equals("vivek");

//        System.out.println(predicate.test("vivek"));

        Predicate<String>predicate3=t->t.equals("raj");

//        System.out.println(predicate.test("raj"));


        // 2nd -------------
        Predicate<Integer>predicate2=t->{
            if (t%2==0) return true;
            else return false;
        };
        System.out.println( predicate2.test(5));

//        bipredicate------------------
        BiPredicate<String,Integer> biPredicate=(n1,n2)->{
          if (n1.length()==n2) return true;
          else return false;
        };

        System.out.println(biPredicate.test("vivek",5));

        // and---------------------------
      Boolean ob= predicate.and(predicate3).test("vivek");
        System.out.println(ob);
    }
}
