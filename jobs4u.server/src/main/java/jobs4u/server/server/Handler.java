package jobs4u.server.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public abstract class Handler implements Runnable {


    private static final Logger LOGGER = LoggerFactory.getLogger(Handler.class);

    protected Socket socket;

    //TODO Add coms protocol
    protected ObjectInputStream input;
    protected ObjectOutputStream output;

    //
    public Handler(Socket socket) throws IOException {
        this.socket = socket;
        this.input = new ObjectInputStream(socket.getInputStream());
        this.output = new ObjectOutputStream(socket.getOutputStream());
    }


    public abstract void handle();


    @Override
    public void run() {
        try{
            handle();
            ServerSemaphore.getInstance().exitCriticalSection();
        }catch (Exception e){
//            LOGGER.error("There was an error during handler. Closing connection...");
            System.out.println("Connection lost!");
            try {
                socket.close();
            } catch (IOException ex) {
                LOGGER.error("There was an error closing socket. Ignoring closing...");
                return;
            }
            LOGGER.info("Socket closed successfully!");
        }
    }
}
