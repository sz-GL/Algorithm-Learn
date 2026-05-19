package operator;

public class operator13 {
    public static void main(String[] args) {
//        1.定义一个俩位整数
        int a=10;
//        2.获取这个整数的十位和个位
        int shi=a/10;
        int ge=a%10;
//        3.当前数字是否是7的有缘数
        boolean result=shi==7 || ge==7;
        System.out.println(result);
    }
}
