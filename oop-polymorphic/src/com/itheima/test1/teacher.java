package com.itheima.test1;

public class teacher extends  person{
   public teacher() {
    }
    public teacher(String name,String username,String password) {
         super(name, username, password);
    }

    public void show(){
        System.out.println("老师");
    }
}
