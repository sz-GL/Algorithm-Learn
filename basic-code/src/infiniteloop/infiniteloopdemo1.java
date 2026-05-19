package infiniteloop;

import java.util.Scanner;

public class infiniteloopdemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入一个大于2的整数：");
            int num = sc.nextInt();

            if (num <= 2) {
                System.out.println("输入不合法，请输入一个大于2的整数。\n");
                continue;
            }

            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + "是质数。");
                break;
            } else {
                System.out.println(num + "不是质数，请重新输入。\n");
            }
        }

        sc.close();
    }
}
