package com.itheima.test5;

public class dog extends animal implements swim{
    public dog() {
    }

    public dog(String name, String color) {
        super(name, color);
    }
    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }
    @Override
    public void swim() {
        System.out.println("狗刨式");
    }
}
