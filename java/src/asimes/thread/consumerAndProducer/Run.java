package asimes.thread.consumerAndProducer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lianglab on 2016/8/8.
 * 功能 ：
 */
public class Run {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        MyService service = new MyService(10);
        executor.execute(new Producer(service,0));
        for (int i = 0; i < 10; i++) {
            executor.execute(new Consumer(service,i));
        }
//        Consumer c1 = new Consumer(service,1);
//        Producer p1 = new Producer(service,1);
//        Consumer c2 = new Consumer(service,2);
//        Producer p2 = new Producer(service,2);
//        Consumer c3 = new Consumer(service,3);
//        Producer p3 = new Producer(service,3);
//        Consumer c4 = new Consumer(service,4);
//        Producer p4 = new Producer(service,4);
//        Consumer c5 = new Consumer(service,5);
//        Producer p5 = new Producer(service,5);
    }
}
