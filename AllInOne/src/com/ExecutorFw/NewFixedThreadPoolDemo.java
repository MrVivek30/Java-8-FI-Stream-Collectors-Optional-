package com.ExecutorFw;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPoolDemo implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<=3000;i++){
            System.out.println("thread 1 "+i);

        }


        System.out.println("End of thread-----------------------");
    }

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newFixedThreadPool(2147483647);

        for (int i=0;i<100;i++){


            executorService.execute(new NewFixedThreadPoolDemo());
        }


        executorService.shutdown();
    }
}
