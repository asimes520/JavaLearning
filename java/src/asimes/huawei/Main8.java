package asimes.huawei;

import java.util.Scanner;

/**
 * Created by lianglab on 2016/9/1.
 * 功能 ：一开始有N个汽水瓶盖，每3个瓶盖可以兑一瓶新的汽水，问最后最多能喝多少瓶汽水，可有向老板借瓶盖
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
