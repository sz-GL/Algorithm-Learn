package com.itheima.oopextendtest7;

public class zhinengshebei {
    String name;
    double price;
    public double payment(){
        if(price>=0&&price<1000){
            return price;
        } else if (price>=1000&&price<5000) {
            return price*0.9;
        } else if (price>=5000&&price<10000){
            return price*0.8;
        } else if (price>=10000){
            return price*0.7;
        } else {
            System.out.println("价格输入有误");
            return 0;
        }
    }
}
