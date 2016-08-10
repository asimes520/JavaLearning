package asimes.algorithm.datastructure.treeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by lianglab on 2016/8/10.
 * 功能 ：
 */
public class TreeSetTest {

    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster",9912));
        parts.add(new Item("Widget",4562));
        parts.add(new Item("Modem", 1234));
        System.out.println(parts);
        SortedSet<Item> sortByDesc = new TreeSet<>(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                String descA = o1.getDescription();
                String descB = o2.getDescription();
                return descA.compareTo(descB);
            }
        });








        sortByDesc.addAll(parts);
        System.out.println(sortByDesc);
    }
}

