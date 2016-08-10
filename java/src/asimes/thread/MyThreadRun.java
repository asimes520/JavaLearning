package asimes.thread;

/**
 * Created by lianglab on 2016/7/28.
 * 功能 ：
 */
public class MyThreadRun extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println(this.currentThread().getName() + " count : " + count);
    }

    public static void main(String[] args) {
        MyThreadRun myThreadRun = new MyThreadRun();
        Thread a = new Thread(myThreadRun, "A");
        Thread b = new Thread(myThreadRun, "B");
        Thread c = new Thread(myThreadRun, "C");
        Thread d = new Thread(myThreadRun, "D");
        Thread e = new Thread(myThreadRun, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
