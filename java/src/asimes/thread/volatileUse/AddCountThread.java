package asimes.thread.volatileUse;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lianglab on 2016/8/1.
 * 功能 ：
 */
public class AddCountThread implements Runnable{
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
