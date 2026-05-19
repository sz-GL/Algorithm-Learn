package loopwhile;

public class whiledemo2 {
    public static void main(String[] args) {
        double money = 100000;
        double target = 200000;
        double rate = 0.017;
        int year = 0;

        while (money < target) {
            money = money * (1 + rate);
            year++;
        }

        System.out.println("本金翻倍需要：" + year + "年");

    }
}
