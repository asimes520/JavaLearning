package asimes.thread;

/**
 * Created by lianglab on 2016/7/28.
 * 功能 ：
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
//        System.out.println("My Thread!");
        for (int i = 0; i < 50; i++) {
            System.out.println("Thread - " + i);
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);

        myThread.start();
        System.out.println("已经结束");
    }
}
