package com.itheima.oopextendtest10;

public class Teacher extends  Person{
    private String subject;

    public Teacher() {
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void teach(){
        System.out.println("老师正在讲课");
    }
}
