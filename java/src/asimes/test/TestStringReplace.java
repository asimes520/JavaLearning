package asimes.test;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;

/**
 * Created by lianglab on 2016/8/1.
 * 功能 ： 给定字符串，替换其中的xy为x,这里考虑两种情况，一种是只替换xy，一种是考虑xyy的情况，是否要替换成x.
 */
public class TestStringReplace {
    public static void main(String[] args) {
        String str = "xaabyvxyswxyyyxaskxyf";
        System.out.println(strReplaceWithQueue(str));
    }

    //一种是只替换xy，
    public static String strReplace(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && i < length - 1) {
                sb.append(str.charAt(i));
                i++;
            } else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    //一种是考虑xyy的情况，是否要替换成x.此处用队列实现
    public static String strReplaceWithQueue(String str){
        ArrayDeque<Character> queue = new ArrayDeque<Character>();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if(str.charAt(i) == 'y' && queue.getLast() == 'x'){
            }else {
                queue.add(str.charAt(i));
            }
        }
        return queue.toString();
    }

}
