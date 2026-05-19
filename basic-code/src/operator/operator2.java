package operator;

import java.util.Scanner;
public class operator2 {
    public static void main(String[] args) {
//1.键盘录入一个三位数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number=sc.nextInt();
        System.out.println(number);
//        2.获取个位
        int ge=number%10;
        System.out.println("个位是"+ge);
//        3.获取十位
        int shi=number/10%10;
        System.out.println("十位是"+shi);
//        4.获取百位
        System.out.println("百位是"+number/100);

    }
}
