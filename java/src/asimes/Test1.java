package asimes;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;

/**
 * Created by lianglab on 2016/8/2.
 * 功能 ：
 */
public class Test1 {
    static String result = "";
    public static void main(String[] args) {
//    method(1);
//        method(0);
//        System.out.println(result);
//        String s1 = "abc"+ "def";
//        String s2 = new String(s1);
//        if(s1==s2){
//            System.out.println("ss");
//        }
//        if(s1.equals(s2)){


//            System.out.println("22");
//
//        }
        HashMap map = new HashMap<Integer,Integer>();
        fa(map);
        for (Iterator it =map.keySet().iterator();it.hasNext();){
            Object key = it.next();
            System.out.println(key + "=" + map.get(key));
        }

        Queue<String> queue = new ArrayDeque<String>();

    }

static void fa(HashMap hashMap){
    hashMap = new HashMap<Integer,String>();
    hashMap.put(6,"apple");
    hashMap.put(3,"banana");
    hashMap.put(2,"pear");
    hashMap.put(null,null);
    hashMap.put(null,null);

}

    static void method(int i){
        try{
            if(i==1){
                throw new Exception();
            }
        }catch (Exception e){
            result += "2";
            return;
        }finally {
            result += "3";
        }
        result +="4";
    }
}
