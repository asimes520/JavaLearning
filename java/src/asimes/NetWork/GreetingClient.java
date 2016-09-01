package asimes.NetWork;

import java.io.*;
import java.net.Socket;

/**
 * Created by lianglab on 2016/8/17.
 * 功能 ：
 */
public class GreetingClient {
    public static void main(String[] args) throws IOException {
        String name = args[0];
        int port = Integer.parseInt(args[1]);
        Socket client = null;
        try  {
            System.out.println("Connecting to " + name + " on port "+port);
            client = new Socket(name, port);
            System.out.println("Just connected to "+ client.getRemoteSocketAddress());
            OutputStream os = client.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream is = client.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println("Server says "+dis.readUTF());
            dis.close();
            is.close();
            dos.close();
            os.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            client.close();
        }
    }
}
