package infiniteloop;

import java.util.Random;
import java.util.Scanner;

public class infiniteloopdemo2 {
    public static void main(String[] args) {
        Random r = new Random();
        int target = r.nextInt(100) + 1;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请猜一个1-100之间的数字：");
            int guess = sc.nextInt();
            count++;

            if (guess > target) {
                System.out.println("猜大了，请继续猜。\n");
            } else if (guess < target) {
                System.out.println("猜小了，请继续猜。\n");
            } else {
                System.out.println("恭喜你，猜中了！");
                System.out.println("你一共猜了" + count + "次。");
                break;
            }
        }

        sc.close();
    }
}

