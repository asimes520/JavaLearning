package asimes.serialize;

import java.io.*;

/**
 * Created by lianglab on 2016/8/31.
 * 功能 ：
 */
public class TestDataObjectSerial {
    public static void main(String[] args) throws Exception {
//        serial();
        DataObject dataObject = deSerial();
        System.out.println(dataObject.getWord());
        System.out.println(dataObject.getI());
    }

    public static void serial() throws FileNotFoundException,
            IOException {

        DataObject dataObject = new DataObject();
        dataObject.setWord("123");
        dataObject.setI(2);
        // ObjectOutputStream 对象输出流，将Person对象存储到E盘的Person.txt文件中，完成对Person对象的序列化操作
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File("E:/dataObject.txt")));
        oo.writeObject(dataObject);
        System.out.println("dataObject对象序列化成功！");
        oo.close();
    }

    /**
     * MethodName: DeserializePerson
     * Description: 反序列Perons对象
     * @author lianglab
     * @return
     * @throws Exception
     * @throws IOException
     */
    private static DataObject deSerial() throws Exception, IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("E:/dataObject.txt")));
        DataObject dataObject = (DataObject) ois.readObject();
        System.out.println("dataObject对象反序列化成功！");
        return dataObject;
    }
}
