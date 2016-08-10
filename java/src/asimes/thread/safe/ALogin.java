package asimes.thread.safe;

/**
 * Created by lianglab on 2016/7/28.
 * 功能 ：
 */
public class ALogin extends Thread{
    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("a","aa");
    }
}
