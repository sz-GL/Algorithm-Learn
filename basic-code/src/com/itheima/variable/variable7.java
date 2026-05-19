package com.itheima.variable;

import java.util.Scanner;

public class variable7 {
    public static void main(String[] args) {
//        1.找到scanner这个打工人
        Scanner sc=new Scanner(System.in);
//        2.让Scanner干活
        System.out.println("请输入一个整数：");
        int num=sc.nextInt();
        System.out.println(num);
//        3.让Scanner再次接收第二个整数
        System.out.println("请输入第二个整数：");
        int num2=sc.nextInt();
        System.out.println(num2);
//求和
int sum=num+num2;
    System.out.println("两个整数的和是"+sum);
    }
}
