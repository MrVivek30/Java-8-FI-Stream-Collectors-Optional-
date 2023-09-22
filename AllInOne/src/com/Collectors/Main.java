package com.Collectors;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Optional<String> op1 = Optional.of("Vivek");
        Optional<Optional<String>> opp2 =Optional.of(Optional.of(" arvind")) ;

//        System.out.println(newOp);

//        Optional<String>optionalS2=Optional.of("Vivek");
//        System.out.println(optionalS.equals(""));
//        System.out.println(optionalS2.toString());

        Optional<String>result=op1.flatMap(v->opp2.map(d-> v+ d.orElse("")));
//        Optional<String>result=op1.map(v-> String.valueOf(opp2.map(d-> v+ d.orElse(""))));

        System.out.println(result);



    }
}
