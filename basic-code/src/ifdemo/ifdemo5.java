package ifdemo;

public class ifdemo5 {
    public static void main(String[] args) {
//        1.定义一个小数表示考试成绩
        double score=200;



//        2.先判断成绩是否合理
        if(score>=0&&score<=100){
            if(score>=60){
                System.out.println("优秀");
            }else{
                System.out.println("不及格");
            };
        }else{
            System.out.println("成绩不合理");
        }

    }
}
