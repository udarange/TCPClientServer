package Client.TCPClient_Impl;
/**
 * TCP Client iml
 * Created by archana on 1/30/18.
 */

import java.io.*;
import java.net.*;

/**
 * client object impl
 */
public class Client_Impl {
    public void clientGenerator(int num) throws IOException, InterruptedException {
        String updatedWeather;

        while (true) {
            try {
                /* Web socket initialization*/
                Socket clientSocket = new Socket("localhost", 4455);

                /* Server response reader initialization*/
                InputStreamReader inputStreamReader = new InputStreamReader(clientSocket.getInputStream());
                BufferedReader inFromServer = new BufferedReader(inputStreamReader);

                /* read server response */
                updatedWeather = inFromServer.readLine();

                System.out.println("RECEIVED FROM SERVER TO " + num + " : " + updatedWeather);

                /* close() */
                clientSocket.close();
            } catch (IOException e) {
                System.out.println("ERROR");
                System.exit(1);
            }

            /* wait 3 seconds */
            Thread.sleep(100);
        }
    }
}
