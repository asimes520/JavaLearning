package asimes.thread.countDownLatchTest;

/**
 * Created by lianglab on 2016/8/12.
 * 功能 ：
 */
import java.util.concurrent.CyclicBarrier;

public class TestThread {
    public static void main(String[] args){
        final CyclicBarrier objectCyclicBarrier=new CyclicBarrier(3);
        Thread thread1= new Thread(){
            public void run(){
                try{
                    objectCyclicBarrier.await();
                }catch(Exception e){

                }
                System.out.println(1);
            }
        };
        thread1.start();
        Thread thread2= new Thread(){
            public void run(){
                try{
                    objectCyclicBarrier.await();
                }catch(Exception e){

                }
                System.out.println(2);
            }
        };
        thread2.start();
        Thread thread3= new Thread(){
            public void run(){
                try{
                    objectCyclicBarrier.await();
                }catch(Exception e){

                }
                System.out.println(3);
            }
        };
        thread3.start();
        System.out.println(4);

    }
}