package ifdemo;

public class ifdemo8 {
    public static void main(String[] args) {
//1.定义一个变量记录商品价格
        double price = 1000;
//        2.定义变量记录使用优惠券后,少付的价格
        double price1 = 0;
//        3.计算使用优惠券后,少付的价格
        if (price > 0) {
            if (price < 10) {
                price1 = 0;
            } else if (price < 50) {
                price1 = 8;
            } else if (price < 100) {
                price1 = 30;
            } else if (price < 200) {
                price1 = 50;
            } else {
                price1 = 90;
            }
        } else {
            System.out.println("价格有误");
        }

//        4.定义变量记录使用会员卡后,少付的价格
        double price2 = price * 0.2;
//    5.比较优惠券和会员卡哪个更优惠
        if(price1>price2){
            System.out.println("使用会员卡更优惠，少付的价格是："+price2);
        }else if(price1<price2){
            System.out.println("使用优惠券更优惠，少付的价格是："+price1);
        }else{
            System.out.println("两种方式一样优惠，少付的价格是："+price1);
        }


    }
}
