package asimes.thread.countDownLatchTest;

import java.util.concurrent.CountDownLatch;

/**
 * Created by lianglab on 2016/8/12.
 * 功能 ：
 */
public class Worker extends Thread{
    private String name ;
    private CountDownLatch latch;
    public Worker( String name) {
        this.name = name;
    }

    public void setLatch(CountDownLatch latch) {
        this.latch = latch;
    }

    public void doWork(){
        try {
            System.out.println(name + " is going to work!");
            Thread.sleep(1000);
            System.out.println(name + " work completed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        super.run();
        try {
            doWork();
        }finally {
            latch.countDown();
        }
    }
}
