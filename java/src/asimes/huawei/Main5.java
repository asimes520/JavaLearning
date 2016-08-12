package asimes.huawei;

import java.util.Scanner;

/**
 * Created by Liangweiwei on 2016/8/12.
 */
public class Main5 {
    public static void main(String[] args) {
        Main5  main = new Main5();
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.next();
        long str = scanner.nextLong();
        System.out.println(main.ip2Str(ip));
        System.out.println(main.str2Ip(str));
    }

    public  long ip2Str(String ip) {
        String[] strings = ip.split("\\.");
        return Long.valueOf(strings[0]) << 24 | Long.valueOf(strings[1]) << 16 | Long.valueOf(strings[2]) << 8 | Long.valueOf(strings[3]);
    }

    public  String str2Ip(long str) {
        StringBuilder sb = new StringBuilder();
        sb.append((str >> 24) & 0xFF).append(".");
        sb.append((str >> 16) & 0xFF).append(".");
        sb.append((str >> 8) & 0xFF).append(".");
        sb.append(str & 0xFF);
        return sb.toString();
    }

}
