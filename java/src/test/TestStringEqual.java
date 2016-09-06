package test;

import org.junit.Test;

/**
 * Created by Liangweiwei on 2016/8/11.
 */
public class TestStringEqual {
    public static void main(String[] args) {
        String a = "aa";
        String b = "aa";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        a = "cc";
        System.out.println(b);
    }

    @Test
    public void test1(){

    }
}
