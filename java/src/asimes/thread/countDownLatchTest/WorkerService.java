package asimes.thread.countDownLatchTest;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/**
 * Created by lianglab on 2016/8/12.
 * 功能 ：
 */
public class WorkerService extends Thread {
    private CountDownLatch latch;
    ArrayList<Worker> workers = new ArrayList<Worker>();

    public WorkerService(CountDownLatch latch) {
        this.latch = latch;
    }

    public void addWorker(Worker worker) {
        worker.setLatch(latch);
        workers.add(worker);
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < workers.size(); i++) {
                workers.get(i).start();
        }

    }
}
