package com.itheima.ooptest3;

public class dog {
    private String name;
    private int age;
    public void setName(String value){
         name = value;
    }
    public String getName() {
        return name;
    }
    public void setAge(int value){
         if(value>=0&&value<=15){
             age = value;
         }else {
//             打印当前值不在合理范围域的提示信息
             System.out.println("年龄不合法，请重新设置");
         }
    }
    public int getAge() {
        return age;
    }
}
