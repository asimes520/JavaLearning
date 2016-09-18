package asimes.algorithm.myImpl.list;

/**
 * Created by Asimes on 2016/9/12.
 * 单链表的实现类
 */
public class MySingleLinkedList<T extends Comparable> {
    Node<T> head = null;
    private int length = 0;

    public void add(T data) {
        Node<T> node = new Node(data);
        if (head == null) {
            head = node;
            length++;
            return;
        }
        Node<T> cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
        length++;
    }

    public boolean removeOfIndex(int index) {
        if (index < 1 || index > size()) {
            return false;
        }
        if (size() < 1) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            length--;
            return true;
        }
        Node<T> cur = head;
        int tmp = 1;
        while (cur.next != null && tmp < index - 1) {
            cur = cur.next;
            tmp++;
        }
        if (cur.next.next == null) {
            cur.next = null;
        } else {
            cur.next = cur.next.next;
        }
        length--;
        return true;
    }

    public int size() {
        return length;
    }

    //插入排序的一种，交换次数比较多
    public Node<T> orderList() {
        Node<T> nextNode = null;
        T tmp;
        Node<T> curNode = head;
        while (curNode.next != null) {
            nextNode = curNode.next;
            while (nextNode != null) {
                if (curNode.getData().compareTo(nextNode.getData()) > 0) {
                    tmp = curNode.getData();
                    curNode.setData(nextNode.getData());
                    nextNode.setData(tmp);
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        return head;
    }

    //正常的插入排序，交换次数比上面的少
    public Node<T> orderList(int i) {
        Node<T> nextNode = null;

        Node<T> curNode = head;
        Node<T> minNode;
        while (curNode.next != null) {
            minNode = curNode;
            nextNode = curNode.next;
            while (nextNode != null) {
                if (minNode.getData().compareTo(nextNode.getData()) > 0) {
                    minNode = nextNode;
                }
                nextNode = nextNode.next;
            }
            //交换两个node的值
            T tmp = curNode.getData();
            curNode.setData(minNode.getData());
            minNode.setData(tmp);

            curNode = curNode.next;
        }
        return head;
    }


    public T getFirst() {
        return head.getData();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (size() > 0) {
            Node<T> cur = head;
            for (int i = 0; i < size(); i++) {
                if(cur == null){

                }
                sb.append(cur.getData() + ",");
                cur = cur.next;
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * 链表去重
     */
    public void deleteDuplecate(){
        Node<T> cur = head;
        Node<T> move;
        while (cur!=null){
            move = cur;
            while (move.next!=null){
                if(cur.getData().compareTo(move.next.getData()) == 0){
                    move.next = move.next.next;
                    length--;
                }
                move = move.next;

            }
            cur =cur.next;
        }
    }

    /**
     * 找出单链表中的倒数第K个元素
     * @param k
     * @return 返回找到的元素
     *
     * 方法：设置两个指针，快指针先走k-1步，然后慢指针块指针同时前移，当快指针到末尾的时候，慢指针正好到倒数第K个位置
     *      不过由于此链表记录的有长度，所以也可以直接遍历到n-k个元素即可，见方法
     */
    public Node<T> findElementFromEnd(int k){
        if (k<1 || k>size()){
            return null;
        }
        int  i = 0;
        Node<T> fast = head;
        Node<T> slow = head;
        for (i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * 找出单链表中的倒数第K个元素
     * @param k
     * @return 返回找到的元素
     *
     * 方法：
     *      不过由于此链表记录的有长度，所以也可以直接遍历到n-k个元素即可
     */
    public Node<T> findElementFromEndByLength(int k){
        if (k<1 || k>size()){
            return null;
        }
       Node<T> cur = head;
        for (int i = 0; i < size()-k; i++) {
            cur = cur.next;
        }
        return cur;
    }
}
