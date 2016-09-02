package asimes.huawei;

import java.util.Scanner;

/**
 * Created by lianglab on 2016/9/1.
 * 功能 ：
 */
public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        str=str.substring(2);
        int i = Integer.valueOf(str,16);
        System.out.println(i);
    }
}
