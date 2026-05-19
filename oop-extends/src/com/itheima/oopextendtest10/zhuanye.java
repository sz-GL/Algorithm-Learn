package com.itheima.oopextendtest10;

public class zhuanye extends Teacher{
    public zhuanye() {
    }

    public zhuanye(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println("老师正在讲课");
    }
}
