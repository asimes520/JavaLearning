package asimes.basic;

import asimes.util.StringUtil;

import java.io.Serializable;

/**
 * Created by lianglab on 2016/9/6.
 * 功能 ：
 */
public class TestStatic implements Serializable {

    static final long serialVersionUID = 1231123123121L;

    static class Inner{
        public static void print(){
            System.out.println("Hello");
        }
    }

    public static int result = 1;

    public static int testFinally1(){
//       int result =1;
        try {
            result ++ ;
            return result;
        }finally {
            result += 1;

            System.out.println("Finally 1");

        }
    }

    public static void main(String[] args) {
//        TestStatic ts = new TestStatic();
//        Integer i = new Integer(1);
//        ts.changeValue(i);
//        System.out.println(i);
//        String str = "OLD";
//        ts.changeValue(str);
//        double x=1,y=2,z=3;
//        y+=z--/++x;
//        System.out.println(y);
//        String s = "nih么玩";
//
//        String re = StringUtil.judgeChineseCharacter(s);
//
//
//        System.out.println(re);
        System.out.println(testFinally1());
    }

    public void changeValue(Integer i){
        i= new Integer(5);
    }
    public void changeValue(String str){
        str= "NEW";
    }
}
