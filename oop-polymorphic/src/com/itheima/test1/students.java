package com.itheima.test1;

public class students extends  person{
    public students() {
    }
    public students(String name,String username,String password) {
         super(name, username, password);
    }

    @Override
    public void work() {
        System.out.println("学生正在学习");
    }
}
