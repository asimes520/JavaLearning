package asimes.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lianglab on 2016/8/11.
 * 功能 ：
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(String.valueOf(chars));
    }
}
