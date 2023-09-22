package com.Practice;

public class Prime {
    public static void main(String[] args) {
        Boolean b = false;
        int num = 7;
        int i = 2;
        while(i*i<=num) {
            if(num%i == 0) {
                System.out.println("Number is not prime");
                break;
            }
            i++;
        }
    }
}
