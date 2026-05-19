package com.itheima.variable;

import java.util.Scanner;

public class variable6 {
    public static void main(String[] args) {
//       1.找到scanner这个打工人
        Scanner sc=new Scanner(System.in);
//        2.让打工人干活，接收键盘录入的整数，接收键盘录入的小数，接收键盘录入的字符串
        int num=sc.nextInt();
        double num2=sc.nextDouble();
        String name=sc.next();
        System.out.println(num);
        System.out.println(num2);
        System.out.println(name);
    }
}
