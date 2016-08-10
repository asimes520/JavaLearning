package asimes.JVM;

/**
 * Created by lianglab on 2016/8/4.
 * 功能 ：
 */
public class Memroy {
    public  int count = 0;
    public  void fun(){
        count++;
        fun();
    }

//    public void m1(){
//        count++;
//
//        this.m2();
//    }
//    public void m2(){
//        count++;
//
//        this.m3();
//    }
//    public void m3(){
//        count++;
//
//        this.m4();
//    }
//    public void m4() {
//        count++;
//
//        this.m1();
//    }

    public static void main(String[] args) {
        Memroy m = new Memroy();
        try{
            m.fun();
//            m.m1();
        }catch (Throwable e){
            System.out.println("length: " + m.count);
            throw e;
        }
    }
}
