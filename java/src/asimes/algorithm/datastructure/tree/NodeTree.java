package asimes.algorithm.datastructure.tree;

import asimes.algorithm.CONSTANT;

/**
 * Created by lianglab on 2016/7/20.
 * 功能 ：
 */
public class NodeTree extends Tree<Node> {

    public NodeTree(Node node) {
        if (node != null) {
            node.setParent(null);
            root = node;
            treeSize = 1;
        } else {
            //防止传入的节点为空
            throw new NullPointerException("传入的父节点为空");
        }
    }

    @Override
    public Node searchNode(int nodeIndex) {
        Node n = root.searchNode(nodeIndex);
        if (n == null) {
            System.out.println("找不到该节点");
        }
        return n;
    }

    @Override
    public boolean addNode(int nodeIndex, int direction, Node node) {
        Node n = searchNode(nodeIndex);
        if (n != null) {
            node.setParent(n);
            if (direction == CONSTANT.TREE_LEFT) {
                node.setDirection(CONSTANT.TREE_LEFT);
                n.setLeftChild(node);
                treeSize++;
                return true;
            } else if (direction == CONSTANT.TREE_RIGHT) {
                node.setDirection(CONSTANT.TREE_RIGHT);
                n.setRightChild(node);
                treeSize++;
                return true;
            } else {
                System.out.println("direction参数不合法");
                return false;
            }
        } else {
            System.out.println("找不到待添加的节点");
            return false;
        }
    }

    @Override
    public boolean deleteNode(int nodeIndex) {
        Node n = this.searchNode(nodeIndex);
        Node parent = n.getParent();
        if (n.getDirection() == CONSTANT.TREE_LEFT) {
            parent.setLeftChild(null);
            return true;
        } else if (n.getDirection() == CONSTANT.TREE_RIGHT) {
            parent.setRightChild(null);
            return true;
        } else
            return false;
    }

    @Override
    public void printTree() {

    }
}
