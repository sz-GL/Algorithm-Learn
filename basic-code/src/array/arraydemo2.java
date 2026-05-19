package array;

public class arraydemo2 {
    public static void main(String[] args) {
//        1.利用静态初始化创建数组
        int[] arr={10,20,30,40,50};
//        2.获取数组中的元素
        int num=arr[0];
        System.out.println(num);
        int num2=arr[3];
        System.out.println(num2);
        int num3=arr[4];
        arr[0]=100;
        System.out.println(arr[0]);
    }
}
