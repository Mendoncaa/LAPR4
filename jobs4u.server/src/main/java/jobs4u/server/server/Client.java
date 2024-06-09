package jobs4u.server.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",10999);
        ObjectOutputStream ois = new ObjectOutputStream(s.getOutputStream());
        ois.writeObject("Hello from the other side, client!");
        s.close();

//        try (Socket socket = new Socket("127.0.0.1", 7878);
//             ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
//             ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
//             Scanner scanner = new Scanner(System.in)) {
//
//            String message;
//            while (true) {
//                System.out.print("Enter message for server (type 'exit' to quit): ");
//                message = scanner.nextLine();
//                out.writeObject(message);
//
//                // Check for exit condition
//                if ("exit".equalsIgnoreCase(message)) {
//                    break;
//                }
//
//                // Read response from server
//                String response = (String) in.readObject();
//                System.out.println("Response from server: " + response);
//            }
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        try (Socket socket = new Socket("127.0.0.1", 7878);
//             ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
//             ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
//             Scanner scanner = new Scanner(System.in)) {
//
//            String message;
//
//            while (true) {
//                System.out.print("Enter message to send to server (type 'exit' to quit): ");
//                message = scanner.nextLine();
//
//                // Enviar mensagem ao servidor
//                out.writeObject(message);
//                out.flush();
//
//                if ("exit".equalsIgnoreCase(message)) {
//                    break; // Encerrar o loop se a mensagem for 'exit'
//                }
//            }
//
//            // Após enviar todas as mensagens, ler as respostas do servidor
//            String response;
//            while (!(response = (String) in.readObject()).equalsIgnoreCase("exit")) {
//                System.out.println("Response from server: " + response);
//            }
//
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
