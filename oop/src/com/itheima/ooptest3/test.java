package com.itheima.ooptest3;

public class test {
    public static void main(String[] args) {
        dog d = new dog();
        d.setName("旺财");
        d.setAge(5);
        System.out.println("小狗的名字是：" + d.getName());
        System.out.println("小狗的年龄是：" + d.getAge());
    }
}
