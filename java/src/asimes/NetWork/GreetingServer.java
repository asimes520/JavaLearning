package asimes.NetWork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lianglab on 2016/8/17.
 * 功能 ：
 */
public class GreetingServer extends Thread {
    private ServerSocket serverSocket;

    public GreetingServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    @Override
    public void run() {
        super.run();
        while (true){
            try {
                System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "....");
                Socket server = serverSocket.accept();
                System.out.println("Just connected to "+server.getRemoteSocketAddress());
                DataInputStream dis = new DataInputStream(server.getInputStream());
                System.out.println(dis.readUTF());
                DataOutputStream dos = new DataOutputStream(server.getOutputStream());
                dos.writeUTF("Thank you for connecting to "
                        + server.getLocalSocketAddress() + "\nGoodbye!");
                server.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
