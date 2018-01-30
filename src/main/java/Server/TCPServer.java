/*
 * (C) Copyright 2010-2018 hSenid Mobile Solutions (Pvt) Limited. All Rights Reserved. These materials are unpublished, proprietary, confidential source code of hSenid Mobile Solutions (Pvt) Limited and constitute a TRADE SECRET of hSenid Mobile Solutions (Pvt) Limited. hSenid Mobile Solutions (Pvt) Limited retains all title to and intellectual property rights in these materials.
 */

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
        System.out.println("Server Started ....");

        while (true) {
            Socket s = serverSocket.accept();
            ClientHandler obj = new ClientHandler(s);

            obj.start();
        }
    }
}
