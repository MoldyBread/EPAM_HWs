package com.company.homework7.annotation;



public class TestClass {

    @BeforeMethod
    public void init(){
        System.out.println("before method");
    }

    @Ignore
    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test(expected = Exception.class)
    public void test2() throws Exception {
        System.out.println("test2");
        throw new Exception("Exception");
    }

    @AfterMethod
    public void after(){
        System.out.println("after method");
    }
}
