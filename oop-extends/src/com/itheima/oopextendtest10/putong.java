package com.itheima.oopextendtest10;

public class putong extends Teacher {
    public putong() {
    }

    public putong(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println("老师正在讲课");
    }

}
