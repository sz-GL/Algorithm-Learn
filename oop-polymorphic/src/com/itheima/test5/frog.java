package com.itheima.test5;

public class frog extends animal implements swim{
    public frog() {
    }

    public frog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("在蛙泳");
    }
}
