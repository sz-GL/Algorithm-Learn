package ifdemo;

public class ifdemo6 {
    public static void main(String[] args) {
//        1.输入一个数字表示价格
        System.out.println("请输入一个数字表示价格：");
        double price=new java.util.Scanner(System.in).nextDouble();

//        2.计算俩个app优惠后的价格
         double price1=price*0.9;

double price2=0;

         if(price>=30){
             price2=price-10;
         }else{
            price2=price;
         }
//3.判断哪个app更优惠
         if(price1<price2){
             System.out.println("饱了么更便宜，价格是："+price1);
         }else if(price1>price2){
             System.out.println("美单更便宜，价格是："+price2);
         }else{
             System.out.println("俩个app一样优惠，价格都是："+price1);
         }
    }
}
