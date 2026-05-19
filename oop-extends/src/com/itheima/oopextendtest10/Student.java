package com.itheima.oopextendtest10;

public class Student extends  Person{
   private String grade;

    public Student() {
    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void study(){
        System.out.println("学习");
    }
}
