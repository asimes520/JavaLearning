package asimes.huawei;

import java.util.Scanner;

/**
 * Created by lianglab on 2016/8/11.
 * 功能 ： 字符串逆序
 */
public class Main1 {
    public static void main(String[] args) {
        Main1 main = new Main1();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = main.reverse(str);
        System.out.println(str);
    }

    //字符串逆序，简单的循环遍历实现
    public  String reverse(String str){
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}