package asimes.serialize;

import java.io.Serializable;

/**
 * Created by lianglab on 2016/8/31.
 * 功能 ：
 */
public class DataObject implements Serializable {
    private static int i=0;
    private String word = "";

    public void setI(int i) {
        DataObject.i = i;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public  int getI() {
        return i;
    }

    public String getWord() {
        return word;
    }
}
