package com.itheima.oopextendtest1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 18;
        s.grade = "高一";
        s.name = "小王";
        System.out.println(s.name + "," + s.age + "," + s.grade);

        s.eat();
        s.study();


        Teacher t = new Teacher();
        t.age = 28;
        t.name = "大王";
        t.subject = "语文";
        System.out.println(t.name + "," + t.age + "," + t.subject);

        t.eat();
        t.teach();
    }
}
