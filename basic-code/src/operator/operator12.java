package operator;

import java.util.Scanner;
public class operator12 {
    public static void main(String[] args) {
//        1.键盘输入一个四位整数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个四位整数：");
        int number=sc.nextInt();

//        2.数字拆分
        int ge=number%10;
        int shi=number/10%10;
        int bai=number/100%10;
        int qian=number/1000;
        System.out.println("个位："+ge);
        System.out.println("十位："+shi);
        System.out.println("百位："+bai);
        System.out.println("千位："+qian);
//        3.判断是否为回文数
        boolean result=ge==qian && shi==bai;
        System.out.println(result);

    }
}
