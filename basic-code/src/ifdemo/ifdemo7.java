package ifdemo;

public class ifdemo7 {
    public static void main(String[] args) {
        // 1.定义一个变量记录商品价格
        double price = 100;

        // 2.定义变量记录使用优惠券后的价格
        double price1 = 0;

        // 3.计算使用优惠券后的价格, 如果价格小于等于0, 输出商品有误并结束
        if (price <= 0) {
            System.out.println("商品有误");
            return;
        }

        if (price < 10) {
            price1 = price;
        } else if (price < 50) {
            price1 = price - 8;
        } else if (price < 100) {
            price1 = price - 30;
        } else if (price < 200) {
            price1 = price - 50;
        } else {
            price1 = price - 90;
        }

        // 4.定义变量记录使用会员卡的价格
        double price2 = price * 0.8;

        // 5.比较优惠券的价格和会员卡的价格
        if (price1 < price2) {
            System.out.println("使用优惠券更优惠，价格是：" + price1);
        } else if (price1 > price2) {
            System.out.println("使用会员卡更优惠，价格是：" + price2);
        } else {
            System.out.println("两种方式价格一样，价格是：" + price1);
        }
    }

}
