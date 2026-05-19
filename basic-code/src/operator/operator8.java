package operator;

import java.util.Scanner;
public class operator8 {
    public static void main(String[] args) {
//        1.键盘录入俩个小数,分别表示我和朋友的身高
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入我的身高：");
        double myHeight=sc.nextDouble();
        System.out.println("请输入朋友的身高：");
//        2.比较我和朋友的身高,如果我的身高大于朋友的身高,则输出true,否则输出false
        double friendHeight=sc.nextDouble();
        boolean result=myHeight>friendHeight;
        System.out.println(result);
    }
}
