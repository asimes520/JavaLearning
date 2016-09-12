package asimes.algorithm.myImpl.list;

/**
 * Created by Asimes on 2016/9/12.
 */
public class ListTest {
    public static void main(String[] args) {
        MySingleLinkedList<Integer> linkedList = new MySingleLinkedList<>();
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(8);
        linkedList.add(6);
        linkedList.add(7);
        System.out.println(linkedList);
        linkedList.removeOfIndex(4);
        System.out.println(linkedList);
    }
}
