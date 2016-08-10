package asimes.thread.volatileUse;

/**
 * Created by lianglab on 2016/8/1.
 * 功能 ：
 */
public class MyThread extends Thread{
    volatile public static int count = 0;
    synchronized public static void addCount(){
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count = " + count);
    }

    @Override
    public void run() {
        super.run();
        addCount();
    }
}
