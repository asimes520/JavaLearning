import java.util.Arrays;

public class Test {
    //    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println(1);
//        System.out.println(2);
//    }
    static {
        System.out.println("Hello World!");
    }

    public Test() {
        print("Hello World!");
    }

    static  int[] b = new int[5];

    public static void main(String[] args) {
//        String s = "OK";
//        StringBuilder sb = new StringBuilder(s);
//        String t = "OK";
//        StringBuilder tb = new StringBuilder(t);
//
//        System.out.println(s.hashCode());
//        System.out.println(sb.hashCode());
//        System.out.println(t.hashCode());
//        System.out.println(tb.hashCode());
//        s = "Hello";
//        System.out.println(s);
//        System.out.println(t);
//        System.out.println(sb);
//        int a = 2;
//        int er = 4;
//        float f = 45.8f;
//        System.out.println(a>>>3);
//        int x =-3,y=-10;
//        System.out.println(y%x);
//        System.out.println(b[0]);
//        boolean c = true?false:true == true ? false : true;
//        System.out.println(c);
//        Arrays.sort(b);
        System.out.println("\t");
    }

    double fun(byte x,double y){
        return (short)x/y*2;
    }

    /**
     * Asimes
     * @param param The String to be printed
     */
    public  void print(String param){
        System.out.println(param);
    }
}
