package asimes;

/**
 * Created by lianglab on 2016/9/5.
 * 功能 ：
 */
public class Ryb {
    public static void main(String[] args) {
        System.out.println(getV());
    }
   public static int getV(){
       try {
           return 0;

       }finally {
           return 1;
       }
   }
}

class ThreadEx extends Thread{
    private Test mv;
    public ThreadEx(Test mv) {
        this.mv = mv;
    }

    @Override
    public void run() {
        synchronized (mv){
            mv.m();
        }
    }
}

class Test{
    private int data = 0;
    int result = 0;
    public void m(){
        result +=2;
        data+=2;
        System.out.println(result+" "+data);
    }
}
