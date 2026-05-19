package array;

import java.util.Arrays;
import java.util.Random;

public class arraydemo7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("打乱前：" + Arrays.toString(arr));

        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = random.nextInt(5);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("打乱后：" + Arrays.toString(arr));
    }
}

