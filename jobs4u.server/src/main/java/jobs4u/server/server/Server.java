package jobs4u.server.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Server.class);
    private static ThreadGroup serverThreadGroup = new ThreadGroup("server-thread-group");
    private ServerSocket socket;
    private boolean running;

    public Server(int port) throws IOException {
        socket = new ServerSocket(port);
        running = false;
    }

    public void start() {
        running = true;
        while (running) {
            try {
                Socket connection = socket.accept();
                if (!running) return; //Force exit new connections TODO: Add exit handler to communicate server shutdown
                ServerSemaphore.getInstance().enterCriticalSection();
                Thread thread = new Thread(serverThreadGroup, new SimpleHandler(connection));
                thread.start();

            } catch (IOException e) {
                System.out.println("Could not accept new connection!");
            } catch (InterruptedException e) {
                System.out.println("Could not wait for connection. Listening to new ones...");
            }
        }
    }


    public void stop() {
        this.running = false;
        try {
            socket.close();
        } catch (IOException e) {
            LOGGER.error("Erro ao fechar o socket do servidor.", e);
        }
    }


    @Override
    public void run() {
        start();
        try {
            socket.close();
        } catch (IOException e) {
            LOGGER.error("Error while closing server socket.", e);
            throw new RuntimeException(e);
        }
    }



    //        running = true;
//        while (running) {
//            try {
//                Socket connection = socket.accept();
//                if (!running) return; //Force exit new connections TODO: Add exit handler to communicate server shutdown
//                ServerSemaphore.getInstance().enterCriticalSection();
//                Thread thread = new Thread(serverThreadGroup, new SimpleHandler(connection));
//                thread.start();
//            } catch (IOException e) {
//                LOGGER.error("Could not accept new connection!", e);
//            } catch (InterruptedException e) {
//                LOGGER.error("Could not wait for connection. Listening to new ones...", e);
//            }
//        }


//        running = true;
//        while (running) {
//            try {
//                Socket connection = socket.accept();
//                LOGGER.info("New client connected: " + connection.getInetAddress().getHostAddress());
//                ServerSemaphore.getInstance().enterCriticalSection();
//                handleClient(connection);
//                connection.close(); // Fechar a conexão após atender o cliente
//            } catch (IOException | InterruptedException e) {
//                LOGGER.error("Could not accept new connection!", e);
//            }
//        }
//    }
//
//    public void stop() {
//        this.running = false;
//    }
//
//    private void handleClient(Socket connection) {
//        try {
//            BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            PrintWriter output = new PrintWriter(connection.getOutputStream(), true);
//
//            // Ler mensagem do cliente
//            String message = input.readLine();
//            LOGGER.info("Received from client: " + message);
//
//            // Enviar resposta ao cliente
//            output.println("Response from server: " + message);
//
//            // Fechar os recursos de entrada e saída
//            input.close();
//            output.close();
//        } catch (IOException e) {
//            LOGGER.error("Error handling client connection.", e);
//        }
//    }
//
//    @Override
//    public void run() {
//        try {
//            start();
//            socket.close();
//        } catch (IOException e) {
//            LOGGER.error("Error while closing server socket.", e);
//            throw new RuntimeException(e);
//        }
//    }
}

