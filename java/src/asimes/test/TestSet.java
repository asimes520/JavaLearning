package asimes.test;

import java.util.HashSet;

/**
 * Created by lianglab on 2016/8/11.
 * 功能 ：
 */
public class TestSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String b = "cc";
        String a = "aa";
        set.add(b);
        set.add(a);
        for (String s: set){
            System.out.println(s);
        }
    }
}
