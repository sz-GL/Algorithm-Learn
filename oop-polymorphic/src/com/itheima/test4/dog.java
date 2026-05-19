package com.itheima.test4;

public class dog extends  animal{
    public dog(){

    }
    public dog(String name,String color){
        super(name,color);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
