package com.itheima.test1;

public class admin extends  person{
    public admin() {
    }
    public admin(String name, String password,String username) {
        super(name, username, password);
    }
    public void show() {
        System.out.println("管理员的工作是");
    }
}
