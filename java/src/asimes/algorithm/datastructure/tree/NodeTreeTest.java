package asimes.algorithm.datastructure.tree;

import asimes.algorithm.CONSTANT;

/**
 * Created by lianglab on 2016/7/21.
 * 功能 ：
 */
public class NodeTreeTest {
    public static void main(String[] args) {
        Person p = new Person("Asimes", 23);
        Person p1 = new Person("Bob", 21);
        Person p2 = new Person("Cindy", 20);
        Person p3 = new Person("Frank", 25);

        Node<Person> node = new Node<>(p, 0);
        Node<Person> node1 = new Node<>(p1, 1);
        Node<Person> node2 = new Node<>(p2, 2);
        Node<Person> node3 = new Node<>(p3, 3);

        NodeTree nt = new NodeTree(node);
        nt.addNode(0, CONSTANT.TREE_LEFT, node1);
        nt.addNode(0, CONSTANT.TREE_RIGHT, node2);
        nt.addNode(1, CONSTANT.TREE_RIGHT, node3);
        Node n = nt.searchNode(3);
        System.out.println(n.getData());
        System.out.println(nt.treeSize);
        nt.deleteNode(1);
        System.out.println(nt.treeSize);
        n = nt.searchNode(3);
        System.out.println(n.getData());
        System.gc();
    }
}
