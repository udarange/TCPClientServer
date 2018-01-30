package Client; /**
 * TCP Client iml
 * Created by archana on 1/30/18.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient2 {
    public static void main(String argv[]) throws Exception {
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

                System.out.println("RECEIVED FROM SERVER: " + updatedWeather);

            /* close() */
                clientSocket.close();
            } catch (IOException e){
                System.out.println("ERROR");
                System.exit(1);
            }

            /* wait 5 seconds */
            Thread.sleep(5000);
        }
    }
}
