package asimes.thread.countDownLatchTest;

import java.util.concurrent.CountDownLatch;

/**
 * Created by lianglab on 2016/8/12.
 * 功能 ：
 */
public class Run {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(10);
        WorkerService workerService1 = new WorkerService(latch);
        for (int i = 0; i < 10; i++) {
            workerService1.addWorker(new Worker(String.valueOf(i)));
        }
        Singer singer = new Singer("VV");
        SingerService singerService = new SingerService(latch,singer);
        workerService1.start();
        singerService.start();
    }
}
