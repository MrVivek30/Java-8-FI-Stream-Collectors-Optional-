package com.ExecutorFw;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class A {
    public static void main(String[] args) {

        ExecutorService executorService= Executors.newFixedThreadPool(999999999);
        executorService.submit(()->{
            System.out.println("chag");
        });
    }
}
