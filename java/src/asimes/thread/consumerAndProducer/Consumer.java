package asimes.thread.consumerAndProducer;

/**
 * Created by lianglab on 2016/8/8.
 * 功能 ：
 */
public class Consumer extends Thread {
    private MyService service;
    private int index;
    public Consumer(MyService service,int index) {
        super();
        this.service = service;
        this.index = index;
    }

    @Override
    public void run() {
        super.run();
        service.consumeFood(index);
    }
}
