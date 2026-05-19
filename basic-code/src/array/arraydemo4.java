package array;

public class arraydemo4 {
//    1.系统的动态初始化创建数组
    public static void main(String[] args) {
        int[] arr=new int[5];
//       2.从键盘中录入数组中的元素
        java.util.Scanner sc=new java.util.Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个元素");
            arr[i]=sc.nextInt();
        }
//        3.遍历数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
