package com.hw11;

@FunctionalInterface
public interface TestInterface {
//    default void testMethod(){
//        System.out.println("sadaa");
//    }

    void bodyLessMethod();

    default void defaultMethod(){
        System.out.println("default Method from interface");
    }



    static void staticMehod(){
        System.out.println("kmamoafs");
    }



//
//    default void withBodyMethod(){
//        System.out.println("asfasfo");
//    }
}
