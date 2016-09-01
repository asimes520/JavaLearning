package asimes.algorithm;

/**
 * Created by Liangweiwei on 2016/8/16.
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int i,j;
        for (i=0;i<arr.length;i++){
            for (j = 0; j < arr.length - i-1; j++) {
                if(arr[j] >arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,6,2,4,3};
        bubbleSort(arr);
       CONSTANT.printArr(arr);
    }
}
