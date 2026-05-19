package operator;

public class operator3 {
    public static void main(String[] args) {
//        1.定义一个变量记录秒数
        int second=3661;
//        2.计算出小时数
        int hour=second/3600;
        System.out.println("小时数是"+hour);
//        3.计算出分钟数
        int minute=second%3600/60;
        System.out.println("分钟数是"+minute);
//        4.计算出秒数
        int sec=second%3600%60;
        System.out.println("秒数是"+sec);
    }
}
