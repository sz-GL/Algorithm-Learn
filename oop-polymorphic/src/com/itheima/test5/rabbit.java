package com.itheima.test5;

public abstract class rabbit extends animal{
    public rabbit() {
    }

    public rabbit(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃胡萝卜");
    }
}
