package ifdemo;

import java.util.Scanner;
public class fidemo9 {
    public static void main(String[] args) {
//        1.从键盘输入变量x、y,判断点所在的区域
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入变量x的值：");
        double x=sc.nextDouble();
        System.out.println("请输入变量y的值：");
        double y=sc.nextDouble();
//        2.如果x=0&&y=0,则输出点在原点
        if(x==0&&y==0){
            System.out.println("点在原点");
        }else if(x==0){
            System.out.println("点在y轴上");
        }else if(y==0){
            System.out.println("点在x轴上");
        }else if(x>0&&y>0){
            System.out.println("点在第一象限");
        }else if(x<0&&y>0){
            System.out.println("点在第二象限");
        }else if(x<0&&y<0){
            System.out.println("点在第三象限");
        }else{
            System.out.println("点在第四象限");
        }

    }
}
