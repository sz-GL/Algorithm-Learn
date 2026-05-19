package loopfor;

import java.util.Scanner;

public class fordemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 15 == 0) {
                count++;
            }
        }

        System.out.println(start + "到" + end + "之间，既能被3整除又能被5整除的数字有" + count + "个。");
    }
}

