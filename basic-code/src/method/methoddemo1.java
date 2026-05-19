package method;

public class methoddemo1 {
    public static void main(String[] args) {
        double len1=10.1 ;
        double width1=5.1;
        double len2=9.1;
        double width2=6.1;
        double area1=calculateArea(len1,width1);
        double area2=calculateArea(len2,width2);
//        如果面积一大于面积二,输出面积一更大
        if(area1>area2){
            System.out.println("面积一更大");
        }else if(area1<area2){
            System.out.println("面积二更大");
        }else{
            System.out.println("面积一和面积二相等");}
    }
    public static double calculateArea(double len,double width){
               return len*width;
                }
}


