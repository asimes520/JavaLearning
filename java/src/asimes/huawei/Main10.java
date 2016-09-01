package asimes.huawei;

import java.util.Scanner;

/**
 * Created by Liangweiwei on 2016/9/2.
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
