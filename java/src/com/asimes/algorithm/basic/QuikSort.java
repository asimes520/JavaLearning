package com.asimes.algorithm.basic;

/**
 * Created by Liangweiwei on 2016/7/23.
 */
public class QuikSort {
    public static void quikSort(int[] arr,int basePoint,int length){
        if(basePoint<length) {
            int i = basePoint, j = length, tmp = arr[i];
            while (i < j) {
                while (i < j && arr[j] >= tmp)
                    j--;
                if (i < j)
                    arr[i++] = arr[j];
                while (i < j && arr[i] <= tmp)
                    i++;
                if (i < j)
                    arr[j--] = arr[i];

            }
            arr[i] =tmp;

            quikSort(arr,basePoint,i-1 );
            quikSort(arr,i+1,length);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 2, 6, 8, 3, 4, 7};
        quikSort(arr, 0, 8);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
