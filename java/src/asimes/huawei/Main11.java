package asimes.huawei;

import java.util.Scanner;

/**
 * Created by Liangweiwei on 2016/9/2.
 */
public class Main11 {

//    输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。
//
//    /**
//     * 统计出英文字母字符的个数。
//     *
//     * @param str 需要输入的字符串
//     * @return 英文字母的个数
//     */
//    public static int getEnglishCharCount(String str)
//    {
//        return 0;
//    }
//
//    /**
//     * 统计出空格字符的个数。
//     *
//     * @param str 需要输入的字符串
//     * @return 空格的个数
//     */
//    public static int getBlankCharCount(String str)
//    {
//        return 0;
//    }
//
//    /**
//     * 统计出数字字符的个数。
//     *
//     * @param str 需要输入的字符串
//     * @return 英文字母的个数
//     */
//    public static int getNumberCharCount(String str)
//    {
//        return 0;
//    }
//
//    /**
//     * 统计出其它字符的个数。
//     *
//     * @param str 需要输入的字符串
//     * @return 英文字母的个数
//     */
//    public static int getOtherCharCount(String str)
//    {
//        return 0;
//    }
//
//
//    知识点	 字符串
//    运行时间限制	10M
//    内存限制	 128
//    输入      输入一行字符串，可以有空格
//    输出      统计其中英文字符，空格字符，数字字符，其他字符的个数
//    样例输入	1qazxsw23 edcvfr45tgbn hy67uj m,ki89ol.\\/;p0-=\\][
//    样例输出	26 3 10 12


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int en=getEnglishCharCount(input);
        int blank = getBlankCharCount(input);
        int num =getNumberCharCount(input);
        int other = input.length()-en-blank-num;
        System.out.println(en);
        System.out.println(blank);
        System.out.println(num);
        System.out.println(other);

    }

    /**
     * 统计出英文字母字符的个数。
     *
     * @param str 需要输入的字符串
     * @return 英文字母的个数
     */
    public static int getEnglishCharCount(String str)
    {
        char[] chars = str.toCharArray();
        char tmp;
        int count=0;
        for (int i = 0; i < chars.length; i++) {
            tmp =chars[i];
            if (tmp>='a'&&tmp<='z' || tmp >='A'&& tmp<='Z')
                count++;
        }
        return count;
    }

    /**
     * 统计出空格字符的个数。
     *
     * @param str 需要输入的字符串
     * @return 空格的个数
     */
    public static int getBlankCharCount(String str)
    {
        char[] chars = str.toCharArray();
        char tmp;
        int count=0;
        for (int i = 0; i < chars.length; i++) {
            tmp =chars[i];
            if (tmp==' ')
                count++;
        }
        return count;
    }

    /**
     * 统计出数字字符的个数。
     *
     * @param str 需要输入的字符串
     * @return 英文字母的个数
     */
    public static int getNumberCharCount(String str)
    {
        char[] chars = str.toCharArray();
        char tmp;
        int count=0;
        for (int i = 0; i < chars.length; i++) {
            tmp =chars[i];
            if (tmp>='0' && tmp<='9')
                count++;
        }
        return count;
    }

    /**
     * 统计出其它字符的个数。
     *
     * @param str 需要输入的字符串
     * @return 英文字母的个数
     */
    public static int getOtherCharCount(String str)
    {
        return 0;
    }

}
