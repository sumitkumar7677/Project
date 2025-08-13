import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("Connectedd to server!");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Thread to receive messages from server
            new Thread(() -> {
                try {
                    String msgFromServer;
                    while ((msgFromServer = input.readLine()) != null) {
                        System.out.println("Server: " + msgFromServer);
                    }
                } catch (IOException e) {
                    System.out.println("Server disconnected.");
                }
            }).start();

            // Main thread to send messages to server
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
            String msgToServer;
            while ((msgToServer = consoleInput.readLine()) != null) {
                output.println(msgToServer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
