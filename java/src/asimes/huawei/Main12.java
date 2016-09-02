package asimes.huawei;

import java.util.Scanner;

/**
 * Created by Liangweiwei on 2016/9/2.
 * 输出一个数的二进制数中1的个数
 */
public class Main12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long i = scanner.nextLong();
        System.out.println(Long.bitCount(i));
        System.out.println(getBitCount(i));
    }


    public static int getBitCount(long n) {
        int count = 0;
        for (long j = n; j > 0; j = j / 2) {
            if (j % 2 == 1) {
                count++;
            }
        }
        return count;
    }

}
