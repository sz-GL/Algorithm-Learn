package com.itheima.variable;

public class variable5 {
    public static void main(String[] args) {
//        BMI=weight/(height*height)
//        1.定义变量记录体重
        double weight=57;
//        2.定义变量记录身高
        double height=1.72;
//        3.定义变量记录BMI值
        double BMI=weight/(height*height);
        System.out.println("我的BMI值是"+BMI);
//        4.计算出当前身高下，标准BMI，对应多少kg体重
        double standardWeight=22.5*height*height;
        System.out.println("我的标准体重是"+standardWeight+"kg");
    }
}
