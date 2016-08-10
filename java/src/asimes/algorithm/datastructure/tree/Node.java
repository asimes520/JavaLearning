package asimes.algorithm.datastructure.tree;

/**
 * Created by lianglab on 2016/7/20.
 * 功能 ：
 */
public class Node<T> {
    T data;
    int nodeIndex;
    int direction;
    Node leftChild;
    Node rightChild;
    Node parent;

    public Node() {
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public Node(T data, int nodeIndex) {
        this.data = data;
        this.nodeIndex = nodeIndex;
        this.direction = -1;
        this.leftChild = null;
        this.rightChild = null;
        this.parent = null;
    }

    public Node(T data, int nodeIndex, Node leftChild, Node rightChild) {
        this.data = data;
        this.nodeIndex = nodeIndex;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Node searchNode(int nodeIndex) {
        Node node = null;
        if(this.getNodeIndex() == nodeIndex){
            node =  this;
        }else {
            if(this.getLeftChild() != null){
                node = this.getLeftChild().searchNode(nodeIndex);

            }
            if(node!=null){
                return node;
            }
            if(this.getRightChild() != null){
                node = this.getRightChild().searchNode(nodeIndex);
            }
        }

        return node;
    }

    public void deleteNode(){
        Node n = null;
        this.data = null;
        this.leftChild = null;
        this.rightChild = null;
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getNodeIndex() {
        return nodeIndex;
    }

    public void setNodeIndex(int nodeIndex) {
        this.nodeIndex = nodeIndex;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Node : " + this.data + " is finalized");
    }
}
