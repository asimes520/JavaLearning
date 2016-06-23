package com.asimes.algorithm.basic;

/**
 * Created by lianglab on 2016/6/23.
 * 功能 ：
 */
public class TestCodePoint {

    public static void main(String[] args) {
        String greeting = "Hello";
        StringBuilder sb = new StringBuilder();
        int n = greeting.length();
        System.out.println(n);
        int cpCount = greeting.codePointCount(0,greeting.length());
        System.out.println(cpCount);
        int index = greeting.offsetByCodePoints(0,4);
        int cp = greeting.codePointAt(index);
        System.out.println(index);
    }
}
