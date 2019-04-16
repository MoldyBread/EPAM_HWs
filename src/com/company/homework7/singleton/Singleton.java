package com.company.homework7.singleton;

public class Singleton {
    private static Singleton instacne;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instacne==null){
            instacne=new Singleton();
        }

        return instacne;
    }
}
