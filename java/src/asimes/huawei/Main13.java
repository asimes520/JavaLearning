package asimes.huawei;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lianglab on 2016/9/2.
 * 功能 ：
 * 有一种技巧可以对数据进行加密，它使用一个单词作为它的密匙。下面是它的工作原理：首先，选择一个单词作为密匙，如TRAILBLAZERS。如果单词中包含有重复的字母，只保留第1个，其余几个丢弃。现在，修改过的那个单词死于字母表的下面，如下所示：
 A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
 T R A I L B Z E S C D F G H J K M N O P Q U V W X Y
 上面其他用字母表中剩余的字母填充完整。在对信息进行加密时，信息中的每个字母被固定于顶上那行，并用下面那行的对应字母一一取代原文的字母(字母字符的大小写状态应该保留)。因此，使用这个密匙，Attack AT DAWN(黎明时攻击)就会被加密为Tpptad TP ITVH。
 请实现下述接口，通过指定的密匙和明文得到密文。
 详细描述：
 接口说明
 原型：
 voidencrypt(char * key,char * data,char * encrypt);
 输入参数：
 char * key：密匙
 char * data：明文
 输出参数：
 char * encrypt：密文
 返回值：
 void


 知识点	     字符串
 运行时间限制	10M
 内存限制	   128
 输入      先输入key和要加密的字符串
 输出      返回加密后的字符串
 样例输入	   nihao ni
 样例输出   le
 */
public class Main13 {
    public static void main(String[] args) {
        Main13 main = new Main13();
        Scanner scanner  = new Scanner(System.in);
        String key = scanner.nextLine();
        String str = scanner.nextLine();
        String result = main.encode(key,str);
        System.out.println(result);
    }

    public  String encode(String key,String str){
        LinkedList<Character> list = new LinkedList<>();
        char c;
        for (c = 'A';c <='Z';c++){
            list.add(c);
        }
        key = key.toUpperCase();
        List<Character> keyList = new ArrayList<>();
        for (int i = 0; i <key.length(); i++) {
            if (!keyList.contains(key.charAt(i))){
                keyList.add(key.charAt(i));
            }
        }
        int index = 0;
        for (int i = 0; i < keyList.size() ;i++) {
            list.remove((Character) keyList.get(i));
            list.add(index++,keyList.get(i));
        }
        StringBuffer sb = new StringBuffer(26);
        for (Character d:list
             ) {
            sb.append(d);
        }

        String upper = new String(sb);
        String lower = upper.toLowerCase();
        StringBuffer result = new StringBuffer(str);
        char tmp;
        for (int i = 0; i < str.length(); i++) {
            int length1 = 'a';
            int length2 = 'A';
            tmp = str.charAt(i);
            if (tmp>='a' && tmp<='z'){
                result.setCharAt(i,lower.charAt(tmp-length1));
            }else if(tmp>='A' && tmp<='Z'){
                result.setCharAt(i,upper.charAt(tmp-length2));
            }
        }
        return new String(result);
    }

}
