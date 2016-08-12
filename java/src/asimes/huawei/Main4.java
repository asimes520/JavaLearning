package asimes.huawei;

import java.util.Scanner;

/**
 * Created by Liangweiwei on 2016/8/12.
 */
public class Main4 {
    public static void main(String[] args) {
        Main4 main = new Main4();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = main.sentenceReverse(str);
        System.out.println(result);
    }

    public String sentenceReverse(String str) {
        String[] strings = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = strings.length - 1; i >= 0; i--) {
            if (!strings[i].equals("")) {
                sb.append(strings[i] + " ");
            }
        }
        return sb.toString();
    }
}
