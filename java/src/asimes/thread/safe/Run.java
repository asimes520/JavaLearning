package asimes.thread.safe;

/**
 * Created by lianglab on 2016/7/28.
 * 功能 ：
 */
public class Run {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
        b.notifyAll();
    }
}
