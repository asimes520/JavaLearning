package asimes.thread;

/**
 * Created by lianglab on 2016/7/28.
 * 功能 ：
 */
public class ThreadRandomSleep extends Thread implements Runnable{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random()*1000);
            try {
                Thread.sleep(n);
                System.out.println("run = " + Thread.currentThread().getName() +" -- " +n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadRandomSleep trs = new ThreadRandomSleep();
        trs.setName("My Thread");
        trs.start();
        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random()*1000);
            try {
                Thread.sleep(n);
                System.out.println("main = " + Thread.currentThread().getName() +" -- " +n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
