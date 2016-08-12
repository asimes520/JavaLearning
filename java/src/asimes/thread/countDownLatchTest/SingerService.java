package asimes.thread.countDownLatchTest;

import java.util.concurrent.CountDownLatch;

/**
 * Created by lianglab on 2016/8/12.
 * 功能 ：
 */
public class SingerService extends Thread{
    private CountDownLatch latch;
    Singer singer;
    public SingerService(CountDownLatch latch,Singer singer){
        this.latch = latch;
        this.singer=singer;
    }

    @Override
    public void run() {
        super.run();
        try {
            //等到计数器为0的时候才开始唱歌
            latch.await();
            singer.doSing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
