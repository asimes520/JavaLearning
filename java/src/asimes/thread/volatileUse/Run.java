package asimes.thread.volatileUse;

import asimes.thread.volatileUse.Run;

/**
 * Created by lianglab on 2016/8/1.
 * 功能 ：
 */
public class Run {
    public static void main(String[] args) {
       MyThread[] threads = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            threads[i].start();
        }
    }
}
