package asimes.thread.countDownLatchTest;

import java.util.concurrent.CountDownLatch;

/**
 * Created by lianglab on 2016/8/12.
 * 功能 ：
 */
public class Singer {
    private String name ;

    public Singer(String name) {
        this.name = name;
    }

    public void doSing() {

        try {
            System.out.println(name + " is going to sing!");
            Thread.sleep(1000);
            System.out.println(name + " sing completed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
