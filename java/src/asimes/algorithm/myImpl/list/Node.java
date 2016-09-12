package asimes.algorithm.myImpl.list;

/**
 * Created by Asimes on 2016/9/12.
 */
public class Node<T>{
    private T data;
    Node next = null;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
