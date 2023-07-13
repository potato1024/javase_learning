package com.itheima.a01mathdemo;

public class MathDemo4 {
    public static void main(String[] args) {
        System.out.println("水仙花数："+ziMiShu(3));
        System.out.println("2位自幂数："+ziMiShu(2));
        System.out.println("四叶玫瑰数："+ziMiShu(4));
        System.out.println("五角星数："+ziMiShu(5));

    }

    public static int ziMiShu(int wei) {

        int count =0;
        for (int i = (int) Math.pow(10, wei - 1); i < (int) Math.pow(10, wei); i++) {
            int num = i;
            int sum = 0;

            for (int i1 = 0; i1 < wei; i1++) {
                int ge = num % 10;
                sum += (int) Math.pow(ge, wei);
                num = num / 10;
            }
            if(sum==i){
                System.out.print(i+" ");
                count++;
            }
        }
        return count;
    }
}
