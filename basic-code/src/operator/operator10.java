package operator;

import java.util.Scanner;

public class operator10 {
    public static void main(String[] args) {
//        1.键盘录入一个整数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number=sc.nextInt();
//       2.判断这个数字是否在一到10之间
        boolean result = number > 1 & number < 10;
        System.out.println(result);


    }
}
