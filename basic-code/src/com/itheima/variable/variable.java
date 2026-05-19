package com.itheima.variable;

public class variable  {
    public static void main(String[] args) {
//        1.定义一个变量记录微信余额
        double money=130;
//        2.定义一个变量记录支付宝余额
        double money2=10;
//        3.定义一个变量记录银行卡余额
        double money3=20;
//        4.输出现在有多少钱
        System.out.println("现在有多少钱："+(money+money2+money3));
//        5.微信收了十块钱红包
        money=money+10;
//        6.微信又发出去2元红包
        money=money-2;
//        7.余额是多少
        System.out.println("余额："+(money+money2+money3));

    }
}
