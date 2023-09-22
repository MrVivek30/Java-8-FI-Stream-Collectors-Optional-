package com.ForkJoinPool;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class FibonacciTask extends RecursiveTask<Integer> {
    private int n;

    public FibonacciTask(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n <= 1) {
            return n;
        } else {
            FibonacciTask task1 = new FibonacciTask(n - 1);
            FibonacciTask task2 = new FibonacciTask(n - 2);
            task1.fork();
            int result2 = task2.compute();
            int result1 = task1.join();
            return result1 + result2;
        }
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        FibonacciTask task = new FibonacciTask(10);
        int result = pool.invoke(task);
        System.out.println("Result: " + result);
    }
}
