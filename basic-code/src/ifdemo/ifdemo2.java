package ifdemo;

import java.util.Scanner;
public class ifdemo2 {
    public static void main(String[] args) {
//        1.定义变量记录人物血量
        int hp=100;
//        2.键盘录入一个值，表示当前人物所受到伤害
        System.out.println("请输入人物受到的伤害：");
        Scanner sc=new Scanner(System.in);
        int damage=sc.nextInt();
//        3.计算当前血量
        hp=hp-damage;
//        如果hp小于等于0，则hp=1
        if(hp<=0){
            hp=1;

        }
        System.out.println("当前血量："+hp);
//        4.键盘录入一个值，表示技能恢复的血量
        System.out.println("请输入技能恢复的血量：");
        int recover=sc.nextInt();
//        5.计算当前血量
        hp=hp+recover;
        if(hp>200){
            hp=200;
        }
        System.out.println("当前血量："+hp);
    }
}
