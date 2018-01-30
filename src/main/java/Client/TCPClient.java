package Client;

import Client.TCPClient_Impl.Client_Impl;

import java.io.IOException;

/**
 * Created by archana on 1/30/18.
 */
public class TCPClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        Client_Impl obj_1 = new Client_Impl();

        obj_1.clientGenerator(1);
    }
}
