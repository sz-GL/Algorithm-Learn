package com.itheima.variable;

import java.util.Scanner;
public class variable8 {
    public static void main(String[] args) {
//        1.键盘录入一个体重
        System.out.println("请输入你的体重：");
        Scanner sc=new Scanner(System.in);
        double weight=sc.nextDouble();
//        2.键盘录入一个身高
        System.out.println("请输入你的身高：");
        double height=sc.nextDouble();
//        3.计算BMI值
        double BMI=weight/(height*height);
        System.out.println("你的BMI值是"+BMI);
    }
}
