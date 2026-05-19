package com.itheima.oopextendtest10;

public class benke extends Student{
    public benke() {
    }

    public benke(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("benke正在学习");
    }
}
