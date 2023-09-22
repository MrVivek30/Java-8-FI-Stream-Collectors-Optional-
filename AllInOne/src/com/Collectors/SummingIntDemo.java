package com.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingIntDemo {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
//               summintInt---for summing int elements using stream
//                                                                Integer::intValue
        int sum=integers.stream().collect(Collectors.summingInt(s->s.intValue()));    // int sum2=integers.stream().collect(Collectors.partitioningBy()));
        System.out.println(sum);

        List<Integer> integers2 = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum2 = integers2.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum2);

    }
}
