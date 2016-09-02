package asimes.huawei;

import java.util.Scanner;

/**
 * Created by Liangweiwei on 2016/9/2.
 * 蛇形三角形输出：最后面不能有空格
 * N=4
 * 1  3  6  10
 * 2  5  9
 * 4  8
 * 7
 *
 * N=5
 * 1  3  6  10  15
 * 2  5  9  14
 * 4  8  13
 * 7  12
 * 11
 *
 */
public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= N - i; j++) {
                if (j != N - i)
                    System.out.print(((j + i) * (j + 1 + i) / 2 - i) + " ");
                else
                    System.out.print(((j + i) * (j + 1 + i) / 2 - i));

            }
            System.out.println();
        }
    }
}
