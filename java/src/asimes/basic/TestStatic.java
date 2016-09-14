package asimes.basic;

import asimes.util.StringUtil;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by lianglab on 2016/9/6.
 * 功能 ：
 */
public class TestStatic implements Serializable {

    static class Sougou{
        @Override
        public int hashCode() {
            return 1;
        }
    }

    public static void main(String[] args) {
//       String s1 = new String("abc");
//        String s2 = "abc";
//        String s3 = new String("abc");
//        String s4 = "a"+"bc";
//        String s5 = new String("a")+"bc";
//        System.out.println(s4==s5);
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//        System.out.println(s2==s4);
        String regex = "\\d+\\.\\d+\\.\\d+\\.\\d+";
        String value= "192.168.1.1";
        System.out.println(value.matches(regex));

    }


}
