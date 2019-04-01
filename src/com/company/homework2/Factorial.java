package com.company.homework2;

import java.math.BigInteger;

public class Factorial {


    private BigInteger factorial(int n){
        return n==0 || n==1 ? BigInteger.valueOf(1):factorial(n-1).multiply( BigInteger.valueOf(n));
    }

    public static void main(String[] args) {

        System.out.println(new Factorial().factorial(200));
    }
}
