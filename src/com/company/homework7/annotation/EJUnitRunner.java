package com.company.homework7.annotation;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EJUnitRunner {
    public static void main(String[] args) throws Exception {
        Class<TestClass> testClazz = TestClass.class;

        //create object

        Constructor<TestClass> constructor = testClazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        //instance
        TestClass instance = constructor.newInstance();

        //methods
        Method[] methods = testClazz.getDeclaredMethods();

        List<Method> beforeMethods = Arrays.stream(methods)
                .filter(method -> (method.isAnnotationPresent(BeforeMethod.class)))
                .collect(Collectors.toList());

        List<Method> testMethods = Arrays.stream(methods)
                .filter(method -> (method.isAnnotationPresent(Test.class)&&!method.isAnnotationPresent(Ignore.class)))
                .collect(Collectors.toList());

        List<Method> afterMethods = Arrays.stream(methods)
                .filter(method -> (method.isAnnotationPresent(AfterMethod.class)))
                .collect(Collectors.toList());

        for (int i = 0; i < testMethods.size(); i++) {
            runMethods(instance, beforeMethods);
            runSingleMethod(instance, testMethods.get(i));
            runMethods(instance,afterMethods);
            //TODO: AfterMethod
        }
    }

    private static void runSingleMethod(Object instance, Method method) {
        try {
            if(method.isAnnotationPresent(Test.class)&&method.getAnnotation(Test.class).expected()!=Test.None.class){
                try{
                    method.invoke(instance);
                    System.out.println("Not cathced");
                }catch (Exception e){
                    System.out.println("catched");
                }
            }else
            {
                method.invoke(instance);
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private static void runMethods(Object instance, List<Method> beforeMethods) {
        beforeMethods.forEach(method->runSingleMethod(instance,method));
    }
}
