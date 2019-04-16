package com.company.homework7.singleton;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<Singleton> clazz = Singleton.class;

        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton = constructor.newInstance();

        System.out.println(singleton);
    }
}
