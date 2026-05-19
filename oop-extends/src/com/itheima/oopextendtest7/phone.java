package com.itheima.oopextendtest7;

public class phone extends zhinengshebei{
    @Override
    public double payment() {
        double payment = super.payment();

        payment =payment*0.9;
        return payment;
    }
}
