package asimes.huawei;

import java.util.Scanner;

/**
 * Created by Liangweiwei on 2016/8/12.
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String strings[] = str.split("\\.");
        if (strings.length != 4){
            System.out.println("NO");
            return;
        }
        int i;
        for (String tmp : strings) {
            try {
                i = Integer.parseInt(tmp);
                if (i < 0 || i > 255){
                    System.out.println("NO");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
