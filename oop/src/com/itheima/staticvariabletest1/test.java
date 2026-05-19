package com.itheima.staticvariabletest1;

public class test {
    public static void main(String[] args) {
            Student s1 = new Student();
            s1.name= "小名";
            s1.age=19;
            s1.teachername="张老师";
            Student s2 = new Student();
            s2.name= "小王";
            s2.age=18;
            s2.teachername="wei老师";
            System.out.println(s1.name+" "+s1.age+" "+s1.teachername);
            System.out.println(s2.name+" "+s2.age+" "+s2.teachername);
    }
}
