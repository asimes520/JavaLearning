package asimes.thread.exception;

import java.util.concurrent.ThreadFactory;

/**
 * Created by lianglab on 2016/8/5.
 * 功能 ：
 */
public class HandlerThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        System.out.println(this+"creating new Thread");
        Thread t = new Thread(r);
        System.out.println("Created " + t);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        System.out.println("eh " + t.getUncaughtExceptionHandler());
        return t;
    }
}
