package Server;
/**
 * TCP Server impl
 * Created by archana on 1/30/18.
 */

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String argv[]) throws Exception {
        ServerSocket serverSocket = new ServerSocket(4455);
        System.out.print("Waiting for client... ");

        while (true) {
            Socket s = serverSocket.accept();
            ClientWorker c = new ClientWorker(s);

            Thread thread = new Thread(c);
            thread.start();
        }
    }
}
