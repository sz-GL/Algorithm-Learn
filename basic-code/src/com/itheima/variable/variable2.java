package com.itheima.variable;

public class variable2 {
    public static void main(String[] args) {
//        1.定义变量记录我方攻击力
        int myAttack=220;
//        2.定义变量记录我方防御
        int myDefense=85;
//        3.定义变量记录我方血量
        double myHp=1012.5;
//        4.定义我方技能加成
       double mySkill=1.2;
//       5.定义变量记录敌方攻击力
        int enemyAttack=210;
//        6.定义变量记录敌方防御
        int enemyDefense=80;
//        7.定义变量记录敌方血量
        double enemyHp=1223.3;
//        8.定义变量记录敌方技能加成
        double enemySkill=1.3;
//        9.我方第一次进行普通攻击，造成多少伤害，敌方还剩多少血量
        double myDamage=myAttack-enemyDefense;
        enemyHp=enemyHp-myDamage;
        System.out.println("我攻击了敌方，造成"+myDamage+"伤害，敌方还剩"+enemyHp+"血量");
//        10.我方第二次进行技能攻击，造成多少伤害，敌方还剩多少血量？
        myDamage=myAttack*mySkill-enemyDefense;
        enemyHp=enemyHp-myDamage;
        System.out.println("我使用了技能攻击，造成"+myDamage+"伤害，敌方还剩"+enemyHp+"血量");
    }
}
