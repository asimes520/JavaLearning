package asimes.algorithm.datastructure.tree;

/**
 * Created by lianglab on 2016/7/20.
 * 功能 ：
 */
public abstract class Tree<T> {

    T root;
    int treeSize;

    /**
     * 搜索树中某个索引位置的节点
     * @param nodeIndex 待搜索的节点索引
     * @return 返回当前索引位置的节点
     */
    public abstract   T searchNode(int nodeIndex);


    /**
     * 往树中添加节点
     * @param nodeIndex  节点索引
     * @param direction  节点位置：左子树 TREE_LEFT =  0; 右子数 TREE_RIGHT = 1;
     * @param node 插入的节点
     * @return 节点是否插入成功
     */
    public abstract boolean addNode(int nodeIndex,int direction,T node);

    /**
     * 删除索引节点
     * @param nodeIndex 待删除的节点索引
     * @return 节点是否成功删除
     */
    public abstract boolean deleteNode(int nodeIndex);

    /**
     * 打印树中的数据
     */
    public abstract void printTree();
}
