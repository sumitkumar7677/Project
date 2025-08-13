import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started. Waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            // Reader and Writer
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Thread for receiving messages
            new Thread(() -> {
                try {
                    String msgFromClient;
                    while ((msgFromClient = input.readLine()) != null) {
                        System.out.println("Client: " + msgFromClient);
                    }
                } catch (IOException e) {
                    System.out.println("Client disconnected.");
                }
            }).start();

            // Main thread for sending messages
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
            String msgToClient;
            while ((msgToClient = consoleInput.readLine()) != null) {
                output.println(msgToClient);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
