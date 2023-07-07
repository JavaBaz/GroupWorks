package com.hw11;

public class ClassForInterface implements TestInterface{

    @Override
    public void bodyLessMethod() {
        System.out.println("from bodyLessMethod");
    }

    @Override
    public void defaultMethod() {
        System.out.println("It has been Override!");
    }



}
