package asimes.algorithm.basic;

import java.util.*;

/**
 * Created by lianglab on 2016/8/9.
 * 功能 ：
 */
public class TestLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("AA");
        list.add("BB");
        list.add("CC");
//        ListIterator<String> iterator = list.listIterator();
//        String s = iterator.next();
//        System.out.println(s);
//        s = iterator.next();
//        System.out.println(s);
//        s = iterator.previous();
//        System.out.println(s);
//        s = iterator.previous();
//        System.out.println(s);
//        iterator.add("DD");
//        iterator.remove();
//        System.out.println();
//        for (String str : list) {
//            System.out.println(str);
//        }
        Iterator iterator1 = list.iterator();
        Iterator iterator2 = list.iterator();
        iterator1.next();
        iterator1.remove();
        iterator2.next();
        String s = "11";
        s.hashCode();
    }
}
