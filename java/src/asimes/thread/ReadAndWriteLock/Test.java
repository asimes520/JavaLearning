package asimes.thread.ReadAndWriteLock;

/**
 * Created by lianglab on 2016/8/12.
 * 功能 ：
 */
public class Test {
    public static void main(String[] args) {
        PricesInfo pricesInfo = new PricesInfo();

        Reader[] readers = new Reader[5];
        Thread[] readerThread = new Thread[5];
        for (int i=0; i<5; i++){
            readers[i]=new Reader(pricesInfo);
            readerThread[i]=new Thread(readers[i]);
        }

        Writer writer=new Writer(pricesInfo);
        Thread threadWriter=new Thread(writer);

        for (int i=0; i<5; i++){
            readerThread[i].start();
        }
        threadWriter.start();
    }
}