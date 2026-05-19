package com.itheima.test4;

public class cat extends  animal{
    public cat (){
    }
    public cat(String name, String color) {
        super(name, color);
    }
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
