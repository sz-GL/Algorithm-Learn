package com.itheima.test5;

public class test {
    public static void main(String[] args) {
        frog r =new frog("小亲王","黑色");
        System.out.println(r.getName()+","+r.getColor());
        r.eat();
        r.swim();
    }
}
