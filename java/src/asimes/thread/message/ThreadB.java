package asimes.thread.message;

/**
 * Created by lianglab on 2016/8/1.
 * 功能 ：
 */
public class ThreadB extends Thread {
    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        try {
            while(true){
                if(list.size()==5){
                    System.out.println("添加了5个元素了");
                    throw new InterruptedException();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
