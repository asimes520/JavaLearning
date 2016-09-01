package asimes.thread.semaphore;

/**
 * Created by Liangweiwei on 2016/8/26.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
