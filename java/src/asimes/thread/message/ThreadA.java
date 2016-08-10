package asimes.thread.message;

/**
 * Created by lianglab on 2016/8/1.
 * 功能 ：
 */
public class ThreadA extends Thread {
    private MyList list;

    public ThreadA(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 10; i++) {
                list.add();
                System.out.println("添加了第" + (i + 1) + "元素");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
