package asimes.algorithm.myImpl.list;

/**
 * Created by Asimes on 2016/9/12.
 */
public class ListTest {
    public static void main(String[] args) {
//        MySingleLinkedList<Integer> linkedList = new MySingleLinkedList<>();
//        linkedList.add(6);
//        linkedList.add(4);
//        linkedList.add(5);
//        linkedList.add(8);
//        linkedList.add(15);
//        linkedList.add(7);
//        System.out.println(linkedList);
//        linkedList.orderList(1);
//        System.out.println(linkedList);

        MySingleLinkedList<NodeImpl> linkedList1 = new MySingleLinkedList<>();
        linkedList1.add(new NodeImpl(6,"aa"));
        linkedList1.add(new NodeImpl(4,"bb"));
        linkedList1.add(new NodeImpl(5,"cc"));
        linkedList1.add(new NodeImpl(8,"dd"));
        linkedList1.add(new NodeImpl(15,"ee"));
        linkedList1.add(new NodeImpl(7,"ff"));
        System.out.println(linkedList1);
        linkedList1.orderList(1);
        System.out.println(linkedList1);
    }
}
