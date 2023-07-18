package com.itheima.mysort;

public class A03_InsertDemo3 {
    public static void main(String[] args) {

        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};


        int start = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                start = i + 1;
                break;

            }
        }
        for (int i = start; i < arr.length; i++) {

            for (int j = i - 1; j >= 0; j--) {
                if (arr[j+1] < arr[j]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                } else break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
