package asimes.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lianglab on 2016/8/12.
 * 功能 ：
 */
public class ArrayCapacity {

    static final int SIZE = 10000000;


    public static void main(String[] args) {
        Student student = null;
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>(SIZE);
        long start, end, time;
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            student = new Student("Asimes", i);
            list1.add(student);
        }
        end = System.currentTimeMillis();
        System.out.println("First : " + (end - start));
        start = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            student = new Student("Asimes", i);
            list2.add(student);
        }
        end = System.currentTimeMillis();
        System.out.println("Second : " + (end - start));

    }

}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


}