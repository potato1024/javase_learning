package com.itheima.search;

public class A04_BlockSearchDemo {
    public static void main(String[] args) {
        /*
            分块查找
            核心思想：
                块内无序，块间有序
            实现步骤：
                1.创建数组blockArr存放每一个块对象的信息
                2.先查找blockArr确定要查找的数据属于哪一块
                3.再单独遍历这一块数据即可
        */
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        Block[] blockArr = {b1, b2, b3};
        int number = 23;
        int index = getIndex(blockArr, arr, number);
        System.out.println(index);
    }

    private static int getIndex(Block[] blockArr, int[] arr, int number) {

        int indexBlock = findIndexBlock(blockArr, number);
        if(indexBlock==-1){
            return -1;
        }
        int start = blockArr[indexBlock].getStart();
        int end = blockArr[indexBlock].getEnd();
        for (int i = start; i <= end; i++) {
            if(arr[i]==number){
                return i;
            }
        }
        return -1;
    }

    private static int findIndexBlock(Block[] blockArr, int num) {

        for (int i = 0; i < blockArr.length; i++) {
            if (num <= blockArr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}
