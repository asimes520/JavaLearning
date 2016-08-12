package asimes.test;

/**
 * Created by lianglab on 2016/8/11.
 * 功能 ：
 */
public class StringMethodTest {
    public static void main(String[] args) {
        String a = "a";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            a += "b";
        }
        long end = System.currentTimeMillis();
        System.out.println("+ ---------" + (end - start));

        String b = "a";
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
           b = b.concat("b");
        }
        end = System.currentTimeMillis();
        System.out.println("concat ---------" + (end - start));

        StringBuilder sb = new StringBuilder("a");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("b");
        }
        end = System.currentTimeMillis();
        System.out.println("append ---------" + (end - start));
    }
}
