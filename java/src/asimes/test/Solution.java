package asimes.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lianglab on 2016/8/25.
 * 功能 ：
 */
public class Solution {
    public static  ArrayList pringListFromTailToHead(ListNode head){
        ArrayList<Integer> list = new ArrayList<>();
        if(head==null){return list;}
        add(head,list);
        return list;
    }
    public static void add(ListNode listNode,ArrayList<Integer> list){
        if(listNode.next==null){
            return;
        }else {
            add(listNode.next,list);
            list.add(listNode.val);
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(null,0);
        ListNode pointer = head;
        for (int i = 1; i < 5; i++) {
            pointer.next = new ListNode(null,i);
            pointer = pointer.next;
        }
        for(ListNode head1 = head;head1.next !=null;head1 = head1.next){
            System.out.println(head1.val);
        }
        ArrayList<Integer> list = pringListFromTailToHead(head);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + "  ");
        }
    }
}

class ListNode{
    public ListNode next;
    public Integer val;

    public ListNode(ListNode next, Integer val) {
        this.next = next;
        this.val = val;
    }
}