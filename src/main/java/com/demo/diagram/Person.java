package com.demo.diagram;

/**
 * Created by liuburu on 2017/5/4.
 */
public class Person {
    private String name;

    public String getName() {
        fun1();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fun1(){
        System.out.println("fun1");
        fun2();
    }

    public void fun2(){
        System.out.println("fun2");
    }
}
