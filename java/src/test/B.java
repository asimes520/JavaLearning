package test;

/**
 * Created by Asimes on 2016/9/13.
 */
public class B extends A {
    public static int b = print(6);
    public  int bb = print(7);
    static {
        print(8);
    }
    public B(String str) {
        super(str);
        System.out.println(str);
    }
    public static int print(int i){
        System.out.println(i);
        return  i;
    }

    public static void main(String[] args) {
        B b = new B("Winner");
    }
}
