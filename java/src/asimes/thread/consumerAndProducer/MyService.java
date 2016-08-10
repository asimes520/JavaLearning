package asimes.thread.consumerAndProducer;

import java.util.Stack;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lianglab on 2016/8/8.
 * 功能 ：
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition pCondition = lock.newCondition();
    private Condition cCondition = lock.newCondition();

    private Stack<String> stack = new Stack<String>();
    private int size;
    private int foodIndex = 0;

    public MyService(int size) {
        this.size = size;
    }

    public void produceFood(int index) {
        try {
            lock.lock();
            while (stack.size() >= size) {
                System.out.println("Producer " + index + " is waiting ");
                pCondition.await();
            }
            System.out.println("Producer " + index + " is producing ");
            Thread.sleep(100);
            stack.push(String.valueOf(foodIndex));
            System.out.println("New food " + (foodIndex++) + " is produced by Producer " + index);
            cCondition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void consumeFood(int index) {
        try {
            lock.lock();
            while (stack.isEmpty()) {
                System.out.println("Consumer " + index + " is waiting");
                cCondition.await();
            }
            System.out.println("Consumer " + index + " is consuming");
            Thread.sleep(2000);
            String str = stack.pop();
            System.out.println("Food " + str + " is consumed ");
            pCondition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
