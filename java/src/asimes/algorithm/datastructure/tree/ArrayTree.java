package asimes.algorithm.datastructure.tree;

/**
 * Created by lianglab on 2016/7/20.
 * 功能 ：
 */
public class ArrayTree<T> extends Tree<T> {
    T[] eArr ;

    public ArrayTree(T[] eArr) {
        treeSize = eArr.length;
        this.eArr = eArr;
        root = eArr[0];
    }

    @Override
    public T searchNode(int nodeIndex) {
        if(nodeIndex<0 || nodeIndex > treeSize){
            System.out.println("传入的参数范围不正确");
            return null;
        }
        if (eArr[nodeIndex] == null){
            System.out.println("位置为空");
        }else {
            System.out.println(eArr[nodeIndex]);
        }
        return eArr[nodeIndex];
    }

    @Override
    public boolean addNode(int nodeIndex, int direction, T node) {
        if(nodeIndex<0 || nodeIndex > treeSize){
            System.out.println("传入的参数范围不正确");
            return false;
        }
        if (eArr[nodeIndex] == null){
            System.out.println("位置为空");
            return false;
        }
        if(direction == 0){
            if((nodeIndex*2 + 1) > treeSize){
                System.out.println("位置溢出");
                return false;
            }
            eArr[nodeIndex*2 + 1] = node;
            return true;
        }else if(direction == 1){
            if((nodeIndex*2 + 2) > treeSize){
                System.out.println("位置溢出");
                return false;
            }
            eArr[nodeIndex*2 + 2] = node;
            return true;
        }else {
            System.out.println("direction参数不合法");
            return false;
        }
    }

    @Override
    public boolean deleteNode(int nodeIndex) {
        return false;
    }

    @Override
    public void printTree() {
        for (int i = 0; i < treeSize; i++) {
            System.out.println(eArr[i]);
        }
    }
}
