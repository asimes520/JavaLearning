package asimes.JVM;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lianglab on 2016/8/4.
 * 功能 ：
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }
}

