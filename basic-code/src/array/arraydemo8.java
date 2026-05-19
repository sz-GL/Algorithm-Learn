package array;

import java.util.Arrays;
import java.util.Random;

public class arraydemo8 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; ) {
            int number = random.nextInt(100) + 1;

            // Check for duplicates before storing.
            boolean exists = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == number) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                arr[i] = number;
                i++;
            }
        }

        System.out.println("生成的10个不重复随机数：" + Arrays.toString(arr));
    }
}

