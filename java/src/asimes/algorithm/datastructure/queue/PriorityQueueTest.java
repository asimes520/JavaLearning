package asimes.algorithm.datastructure.queue;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;

/**
 * Created by lianglab on 2016/8/10.
 * 功能 ：
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<GregorianCalendar> pq = new PriorityQueue<>();
        pq.add(new GregorianCalendar(1997, Calendar.JANUARY, 8));
        pq.add(new GregorianCalendar(1906, Calendar.DECEMBER,22));
        pq.add(new GregorianCalendar(1823, Calendar.OCTOBER,1));
        pq.add(new GregorianCalendar(1993, Calendar.OCTOBER,22));

        System.out.println("遍历-------");
        for (GregorianCalendar data:pq){
            System.out.println(data.get(Calendar.YEAR));
        }
        System.out.println("删除-------");
        while (!pq.isEmpty()){
            System.out.println(pq.remove().get(Calendar.YEAR));
        }

    }
}
