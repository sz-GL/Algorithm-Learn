package array;

import java.util.Scanner;
public class arraydemo5 {
    public static void main(String[] args) {
//1.定义一个数组
        int[] arr={33,5,22,44,55,33};
//        2.键盘输入一个数，判断这个数在数组中是否存在，如果存在则打印索引，不存在则打印“该数据不存在”
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int number=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==number){
                System.out.println("该数据存在，索引为："+i);
                return;
            }
        }
        System.out.println("该数据不存在");
    }
}
