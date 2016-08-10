package asimes.thread.exception;

/**
 * Created by lianglab on 2016/8/5.
 * 功能 ：
 */
public class ExceptionThread implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("run by " + t);
        System.out.println("eh1 = " + t.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}
