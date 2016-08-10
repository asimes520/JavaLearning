package asimes.thread.safe;

/**
 * Created by lianglab on 2016/7/28.
 * 功能 ：
 */
public class SoutThread extends Thread {
    private int i = 5;
    @Override
    public void run() {
        super.run();
        System.out.println("i= " + (i--) + " thread Name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        SoutThread soutThread = new SoutThread();
        Thread t1 = new Thread(soutThread);
        Thread t2 = new Thread(soutThread);
        Thread t3 = new Thread(soutThread);
        Thread t4 = new Thread(soutThread);
        Thread t5 = new Thread(soutThread);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
