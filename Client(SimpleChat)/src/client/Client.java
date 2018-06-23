package client;

import java.io.IOException;
import java.net.Socket;

/**
 * This class make connection to the server
 * @author Nikita.Ustyushenko
 * @version 1.0
 * */
public class Client {

    /** Property - clientName */
    private String clientName;

    /** Property - port */
    private int port;

    /** Property - ip_address */
    private String ipAddress;

    /** Property - socket */
    private Socket socket;

    /**
     * Make new object Client
     * */
    public Client() {

        this.port = 0;
        this.clientName = null;
        this.ipAddress = null;
        this.socket = null;

    }

    /**
     * Make new object Client
     * @param clientName parameter contains information about client name
     * @param ipAddress parameter contains information about server ip address
     * @param port parameter contains information about server port
     * */
    public Client(String clientName, String ipAddress, int port) {

        this.clientName = clientName;
        this.port = port;
        this.ipAddress = ipAddress;
        this.socket = null;

    }

    /**
     * This method start connection with server
     * */
    public void  startConnection() {

        if (this.ipAddress != null && this.port != 0) {

            try {
                this.socket = new Socket(this.ipAddress, this.port);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


    /**
     * This method close connection with server
     * */
    public void closeConnection() {

        if (this.socket != null) {

            try {
                this.socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    /**
     * This method set value of the property port
     * @param port parameter contains information about server port
     * */
    public void setPort(int port) {

        this.port = port;

    }

    /**
     * This method return value of the property port
     * @return value of the property port
     * */
    public int getPort() {

        return this.port;

    }

    /**
     * This method set value of the property ipAddress
     * @param ipAddress parameter contains information about server ip address
     * */
    public void setIpAddress(String ipAddress) {

        this.ipAddress = ipAddress;

    }

    /**
     * This method return value of the property ipAddress
     * @return value of the property ipAddress
     * */
    public String getIpAddress() {

        return this.ipAddress;

    }

    /**
     * This method set value of the property socket
     * @param socket value of the property socket
     * */
    public void setSocket(Socket socket) {

        this.socket = socket;

    }

    /**
     * This method return value of the property socket
     * @return value of the property socket
     * */
    public Socket getSocket() {

        return this.socket;

    }

    /**
     * This method set value of the property clientName
     * @param clientName value of the object String what contains information about client name
     * */
    public void setClientName(String clientName) {

        this.clientName = clientName;

    }

    /**
     * This method return value of the property clientName
     * @return value of the property clientName
     * */
    public String getClientName() {

        return this.clientName;

    }

}
