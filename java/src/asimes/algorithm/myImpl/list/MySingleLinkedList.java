package asimes.algorithm.myImpl.list;

import java.util.Arrays;

/**
 * Created by Asimes on 2016/9/12.
 */
public class MySingleLinkedList<T> {
    Node<T> head = null;
    private int length = 0;

    public void add(T data){
        Node<T> node = new Node(data);
        if (head == null){
            head = node;
            length ++;
            return;
        }
        Node<T> cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
        length ++;
    }

    public boolean removeOfIndex(int index){
        if(index<1 || index > size()){
            return false;
        }
        if (size() < 1){
            return  false;
        }
        if (index ==1){
            head= head.next;
            length--;
            return true;
        }
        Node<T> cur = head;
        int tmp = 1;
        while (cur.next!=null && tmp<index -1){
            cur = cur.next;
            tmp++;
        }
        if(cur.next.next == null){
            cur.next = null;
        }else {
            cur.next = cur.next.next;
        }
        length--;
        return true;
    }

    public int size(){
        return length;
    }

    public T getFirst(){
        return head.getData();
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if(size()>0){
            Node<T> cur = head;
            for (int i = 0; i < size(); i++) {
                sb.append(cur.getData() + ",");
                cur = cur.next;
            }
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append("]");
        return sb.toString();
    }


}
