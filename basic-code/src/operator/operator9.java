package operator;

import java.util.Scanner;
public class operator9 {
    public static void main(String[] args) {
//    1.键盘录入一个三位数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num=sc.nextInt();
//        2.定义变量记录个位\十位\百位
        int ge=num%10;
        int shi=num/10%10;
        int bai=num/100;
//        3.求和
        int sum=ge+shi+bai;
//        4.判断是否能被三整除
        boolean result=sum%3==0;
        System.out.println(result);

    }
}
