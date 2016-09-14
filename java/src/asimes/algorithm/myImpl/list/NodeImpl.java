package asimes.algorithm.myImpl.list;

/**
 * Created by Asimes on 2016/9/14.
 */
public class NodeImpl implements Comparable {
    private int data;
    private String name;

    @Override
    public int compareTo(Object o) {
        if (this.data > ((NodeImpl) o).getData()) {
            return 1;
        } else if (this.data == ((NodeImpl) o).getData()) {
            return 0;
        } else {
            return -1;
        }
    }

    public NodeImpl(int data, String name) {
        this.data = data;
        this.name = name;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NodeImpl{" +
                "data=" + data +
                ", name='" + name + '\'' +
                '}';
    }
}
