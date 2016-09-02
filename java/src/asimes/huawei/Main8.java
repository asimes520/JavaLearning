package asimes.huawei;

import java.util.Scanner;

/**
 * Created by lianglab on 2016/9/1.
 * 功能 ：
 */
public class Main8 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num == 0) break;
            System.out.println(num/2);
        }
    }
}
