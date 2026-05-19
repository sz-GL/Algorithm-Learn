package com.itheima.ooptest2;

public class test {
    public static void main(String[] args) {
//        创建对象记录第一个学生的信息
        student student1 = new student();
        student1.name = "张三";
        student1.age = 20;
        student1.gender = "男";
        student1.height = 1.7;
        student1.weight = 80.0;
        System.out.println(student1.name);
    }
}
