package loopfor;

public class fordemo8 {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }

        System.out.println("S(" + n + ") = " + sum);
    }
}

