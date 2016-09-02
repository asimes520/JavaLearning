package asimes.huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by lianglab on 2016/9/1.
 * 功能 ：给定一个数组，去重并排序
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =scanner.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < count; i++) {
            set.add(scanner.nextInt());
        }

        for (int m:set ) {
            System.out.println(m);
        }
    }
}
