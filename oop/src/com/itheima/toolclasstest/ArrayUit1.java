package com.itheima.toolclasstest;

public class ArrayUit1 {
    private  ArrayUit1() {
    }
    public static void printArr(int[]arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]+"]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }
}
