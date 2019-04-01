
package com.company.HW2;

import java.math.BigInteger;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ThreadingFactorial extends RecursiveTask<BigInteger> {

    int n;
    private ThreadingFactorial(int n){
        this.n=n;
    }


    @Override
    protected BigInteger compute() {
        return n==0||n==1?BigInteger.valueOf(1):BigInteger.valueOf(n).multiply(new ThreadingFactorial(n-1).fork().join());
    }


    public static void main(String[] arg) {
        ForkJoinTask<BigInteger> forkJoinTask = new ThreadingFactorial(22);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        System.out.println(forkJoinPool.invoke(forkJoinTask));
    }
}
