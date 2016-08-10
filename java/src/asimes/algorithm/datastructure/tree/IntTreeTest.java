package asimes.algorithm.datastructure.tree;

import java.util.ArrayList;

/**
 * Created by lianglab on 2016/7/20.
 * 功能 ：
 */
public class IntTreeTest {


    public static void main(String[] args) {
        Integer[] intArr = new Integer[10];
        intArr[0] = 1;
        intArr[1] = 8;
        intArr[2] = 9;
        intArr[3] = 6;
        /**
         *
         *          1(0)
         *      8(1)    9(2)
         *    6(3)
         *
         */
        ArrayTree<Integer> arrayTree = new ArrayTree<>(intArr);
        arrayTree.searchNode(2);
        arrayTree.printTree();
        arrayTree.addNode(1, 0, 4);
        arrayTree.printTree();
    }
}
