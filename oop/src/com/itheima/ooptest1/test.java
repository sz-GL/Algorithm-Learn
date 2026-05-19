package com.itheima.ooptest1;

public class test {
    public static void main(String[] args) {

//        创建对象记录第一只小狗的信息
        Dog dog1 = new Dog();
        dog1.name = "旺财";
        dog1.age = 3;
        dog1.weight = 5.5;
        dog1.color = "白色";
//        打印第一只小狗的信息
        System.out.println("第一只小狗的信息：");
        System.out.println("名字：" + dog1.name);
        System.out.println("年龄：" + dog1.age);
        System.out.println("体重：" + dog1.weight);
        System.out.println("颜色：" + dog1.color);
//        创建对象记录第二只小狗的信息
        Dog dog2 = new Dog();
        dog2.name = "小黑";
        dog2.age = 2;
        dog2.weight = 4.0;
        dog2.color = "黑色";
//        打印第二只小狗的信息
        System.out.println("第二只小狗的信息：");
        System.out.println("名字：" + dog2.name);
        System.out.println("年龄：" + dog2.age);
        System.out.println("体重：" + dog2.weight);
        System.out.println("颜色：" + dog2.color);
    }
}
