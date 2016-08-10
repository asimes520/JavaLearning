package asimes.thread.message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lianglab on 2016/8/1.
 * 功能 ：
 */
public class MyList {
    volatile private List list = new ArrayList();
    public void add(){
        list.add("Hello");
    }
    public int size(){
        return list.size();
    }

}
