package com.example.tonggongcraft;

public class MandrelTypeEvaluationModel {
    public static void main(String[] args) {
//        1.定义固定芯头、浮动芯头、无芯头三个分数
        int score_fixed = 0;
        int socre_floating = 0;
        int socre_none = 0;
//        2.定义任务书内容
        String taskBookContent = "任务书内容示例：需要生产直径为20mm的铜管，长度为2米，要求表面光滑，无氧化层。";
//        3.根据任务书内容评估芯头类型
        if (taskBookContent.contains("表面光滑") && taskBookContent.contains("无氧化层")) {
            score_fixed += 10;
            socre_floating += 5;
            socre_none += 0;
        } else if (taskBookContent.contains("表面光滑")) {
    }
}
