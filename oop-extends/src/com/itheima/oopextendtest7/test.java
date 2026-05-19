package com.itheima.oopextendtest7;

public class test {
    public static void main(String[] args) {
                      phone p=new phone();
                      p.name="华为";
                      p.price=5000;
                      double payment=p.payment();
                      System.out.println(payment);
                      laptop l=new laptop();
                      l.name="华硕";
                      l.price=10000;
                      l.payment();
                       double payment2=l.payment();
                       System.out.println(payment2);
    }
}
