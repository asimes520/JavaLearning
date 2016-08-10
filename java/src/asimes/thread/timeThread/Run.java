package asimes.thread.timeThread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by lianglab on 2016/8/3.
 * 功能 ：
 */
public class Run {
    private static Timer timer = new Timer();
    private static int runCount = 0;
    static public class MyTask1 extends TimerTask{
        @Override
        public void run() {

            try {
                System.out.println("1 begin 运行了！运行时间为: " + new Date());
                Thread.sleep(4000);
                System.out.println("1   end 运行了！时间为： " + new Date() );
                runCount++;
                if(runCount == 5){
                    timer.cancel();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        try {
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dataString1 = "2016-08-03 20:13:55";
            Date date = simpleDateFormat1.parse(dataString1);
            System.out.println("字符串1时间： " + date.toLocaleString()+" 当前时间：" + new Date().toLocaleString());
            timer.scheduleAtFixedRate(task1,date,3000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
