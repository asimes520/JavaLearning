package asimes.test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lianglab on 2016/8/11.
 * 功能 ：
 */
public class TestArray {
    public static void main(String[] args) {
        Integer[] a = {0,2,4,1,3,6,9};
        List list = Arrays.asList(a);

        System.out.println(list.size());
        //list.add(5);  //Exception in thread "main" java.lang.UnsupportedOperationException

    }
}
