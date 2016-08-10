package asimes.thread.message;

/**
 * Created by lianglab on 2016/8/1.
 * 功能 ：
 */
public class Run {
    public static void main(String[] args) {
        MyList list = new MyList();
        ThreadA a = new ThreadA(list);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(list);
        b.setName("B");
        b.start();
    }
}
