package test;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Liangweiwei on 2016/9/5.
 */
public class Main {
    /**
     * 2^(n+1)-2<N<=2^(n+2)-2
     * 2^n<(N+2)/2<=2^(n+1)
     * 求出N
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int arr[] = new int[count];
        while (count>= 0){
            arr[i++] = Integer.parseInt(scanner.nextLine());
            count--;
            if (count == 0) break;
        }
        for (int j:arr
             ) {
            System.out.println(getLuckyNum(j));
        }
//        getLuckyNum(4);
    }

    public static BigInteger getLuckyNum(int N) {
        if (N <= 0) {
            return new BigInteger("0");
        }
        int tmp = N + 2;
        int index = 0;
        if (N == 1) {
            index = 0;

        } else {
            while (true) {
                if (tmp > (1 << (index + 1)) && tmp <= (1 << (index + 2))) {
                    break;
                }
                index++;
            }
        }
        int fromIndex = N - ((int) Math.pow(2, index + 1) - 2) - 1;
        int[] arr = new int[index + 1];
        int i = 0;
        while (fromIndex >= 0) {
            if (fromIndex % 2 == 1) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            i++;
            fromIndex  =  fromIndex/2;
            if (fromIndex ==0) break;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = arr.length-1; j >=0  ; j--) {
            if(arr[j] ==0){
                stringBuilder.append(4);

            }else {
                stringBuilder.append(7);

            }

        }

        return new BigInteger(new String(stringBuilder));
    }
}
