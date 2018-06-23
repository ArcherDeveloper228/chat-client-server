package server;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * This class make server and wait connection clients
 * @author Nikita.Ustyushenko
 * @version 1.0
 * */
public final class Server implements ServerConstProperty {

    /** Property - instance */
    private static Server instance;

    /** Property - signal */
    private boolean signal;

    private static ExecutorService executorService;

    /** Collection - clients */
    private Container<ClientThread> clients;

    /** Property - socket */
    private Socket socket;

    /** Property - server_socket */
    private ServerSocket serverSocket;

    static {

        instance = null;
        executorService = Executors.newFixedThreadPool(5);

    }

    /** Make new object Server */
    private Server() {

        this.signal = false;
        this.socket = null;
        this.serverSocket = null;

    }

    /**
     * This method create single object Server
     * @return value of the object Server
     * */
    public static synchronized Server createServer() {

        if (instance == null) instance = new Server();
        return instance;

    }

    /**
     * This method start work server
     * */
    public void startServer() throws BindException, IOException {

        this.serverSocket = new ServerSocket(PORT);

        // server works while signal = false
        while (this.signal == false) {

            // wait client
            this.socket = this.serverSocket.accept();




        }

    }

    /**
     * This method stop work server
     * */
    public void closeServer() throws IOException {

        // if object socket not null then close him
        if (this.socket != null) this.socket.close();

        // if object server_socket not null then close him
        if (this.serverSocket != null) {

            this.signal = true;
            this.serverSocket.close();
            executorService.shutdown();

        }

    }

    /**
     * This method get value of the property socket
     * @return value of the object Socket
     * */
    public Socket getSocket() {

        return this.socket;

    }

    /**
     * This method set value of the property socket
     * @param socket value of the property socket
     * */
    public void setSocket(Socket socket) {

        this.socket = socket;

    }

    /**
     * This method return value of the property server_socket
     * @return value of the object ServerSocket
     * */
    public ServerSocket getServerSocket() {

        return this.serverSocket;

    }

    /**
     * This method set value of the property server_socket
     * @param server_socket value of the object ServerSocket
     * */
    public void setServerSocket(ServerSocket server_socket) {

        this.serverSocket = server_socket;

    }

    /**
     * This method return collection clients
     * @return collection clients
     * */
    public Container<ClientThread> getClients() {

        return this.clients;

    }

    /**
     * This method set value of the collection clients
     * @param clients value of the collection Container
     * */
    public void setClients(Container<ClientThread> clients) {

        this.clients = clients;

    }
}
