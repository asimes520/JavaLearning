package asimes.test;

/**
 * Created by lianglab on 2016/8/11.
 * 功能 ：
 */
public class TestFinal {
    public static void main(String[] args) {
        final  int i = 0;
        //i+=1;
        addOne(i);
        System.out.println(i);
        int j = i/0;
        System.out.println(j);
    }

    public  static void addOne(int i){
        i = i + 1;
    }
}
