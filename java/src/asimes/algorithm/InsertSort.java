package asimes.algorithm;

/**
 * Created by Liangweiwei on 2016/8/16.
 */
public class InsertSort {
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >0; j--) {
                if(arr[i]<arr[j])
                    break;
            }
//            for (int k = j; k < i; k++) {

            }
//        }
    }
}
