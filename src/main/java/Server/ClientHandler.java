package Server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Thread impl
 * Created by archana on 1/30/18.
 */
public class ClientHandler extends Thread {
    private static Socket serverSocket;

    ClientHandler(Socket s) {
        serverSocket = s;
    }

    private void getWeatherIndex() {
        try {
            WeatherIndexGenerator w = new WeatherIndexGenerator();
            String weatherIndex = w.currentIndex();

            /* output data stream initialization */
            DataOutputStream outToClient = new DataOutputStream(serverSocket.getOutputStream());

            /* write() */
            outToClient.writeBytes(weatherIndex + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        getWeatherIndex();
        System.out.print("Waiting for client... ");
    }
}


