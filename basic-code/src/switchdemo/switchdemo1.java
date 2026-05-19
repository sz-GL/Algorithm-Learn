package switchdemo;

import java.util.Scanner;
public class switchdemo1 {
    public static void main(String[] args) {
//        1.键盘录入星期数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个星期数：");
        int week=sc.nextInt();
//        2.利用switch语句完成减肥小案例
        switch (week){
            case 1:
                System.out.println("今天是星期一，跑步！");
                break;
            case 2:
                System.out.println("今天是星期二，游泳！");
                break;
            case 3:
                System.out.println("今天是星期三，慢走！");
                break;
            case 4:
                System.out.println("今天是星期四，动感单车！");
                break;
            case 5:
                System.out.println("今天是星期五，拳击！");
                break;
            case 6:
                System.out.println("今天是星期六，爬山！");
                break;
            case 7:
                System.out.println("今天是星期日，吃一顿！");
                break;
                default:
                System.out.println("输入的星期数有误！");

        }
    }
}
