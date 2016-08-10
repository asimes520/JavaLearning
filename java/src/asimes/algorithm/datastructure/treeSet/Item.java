package asimes.algorithm.datastructure.treeSet;

import java.util.Objects;

/**
 * Created by lianglab on 2016/8/10.
 * 功能 ：
 */
public class Item implements Comparable<Item> {
    private String description;
    private int partNumber;

    public Item(String description, int partNumber) {
        this.description = description;
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", partNumber=" + partNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o ==null) return false;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        if (partNumber != item.partNumber) return false;
        return description.equals(item.description);

    }

    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    @Override
    public int compareTo(Item o) {
        return Integer.compare(partNumber,o.partNumber);
    }
}
