package com.company.HW1;

public class Fibonacci {

    private int fibonacci(int n){
        return n==1||n==2?1:fibonacci(n-1)*fibonacci(n-2);
    }

    public static void main(String[] args) {

        System.out.println(new Fibonacci().fibonacci(10));
    }
}
