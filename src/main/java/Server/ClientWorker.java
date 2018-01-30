package Server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Thread impl
 * Created by archana on 1/30/18.
 */
public class ClientWorker implements Runnable {
    private Socket serverSocket;

    ClientWorker(Socket s) {
        this.serverSocket = s;
    }

    private synchronized void getWeatherIndex() {
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

    public void run() {
        getWeatherIndex();
        System.out.print("Waiting for client... ");
    }
}


