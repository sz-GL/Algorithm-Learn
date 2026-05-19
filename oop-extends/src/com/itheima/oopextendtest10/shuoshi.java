package com.itheima.oopextendtest10;

public class shuoshi extends Student{
    public shuoshi() {
    }

    public shuoshi(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("硕士正在学习");
    }

    @Override
    public void sleep() {
        System.out.println("硕士住宿条件升级，正在睡觉");
    }
}
