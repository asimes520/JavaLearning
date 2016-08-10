package asimes.algorithm.basic;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by lianglab on 2016/8/9.
 * 功能 ：
 */
public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello World Java My Love";
        str = charReverse1(str);
        System.out.println(str);
    }

    //字符串逆序，简单的循环遍历实现
    public static String charReverse1(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
             sb.append(chars[i]);
        }
        return sb.toString();
    }

    //字符串逆序，Stack栈实现，不过略显复杂
    public static String charReverse2(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack();
        for (int i = 0; i <chars.length; i++) {
            stack.push(chars[i]);
        }
        int size = stack.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    //单词逆序，简单的遍历循环实现
    public static String wordReverse1(String str){
        String[] strings = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i =  strings.length - 1; i >0; i--) {
            sb.append(strings[i] + " ");
        }
        sb.append(strings[0]);
        return sb.toString();
    }

    //单词逆序，使用StringTokenizer和Stack实现
    public static String wordReverse2(String str){
        StringTokenizer st = new StringTokenizer(str);

        Stack<String> stack = new Stack();
        while(st.hasMoreElements()){
            stack.push(st.nextToken());
        }
        int size = stack.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(stack.pop() + " ");
        }
        return sb.toString();
    }
}
