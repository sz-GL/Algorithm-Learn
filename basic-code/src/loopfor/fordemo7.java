package loopfor;

public class fordemo7 {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int current = 0;
        int n = 10;

            for (int i = 3; i <= n; i++) {
                current = first + second;
                first = second;
                second = current;
            }


        System.out.println("第" + n + "位数字是：" + current);
    }
}

