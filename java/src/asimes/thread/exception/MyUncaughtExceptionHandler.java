package asimes.thread.exception;

/**
 * Created by lianglab on 2016/8/5.
 * 功能 ：
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught " + e);
    }
}
