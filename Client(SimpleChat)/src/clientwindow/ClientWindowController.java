package clientwindow;

import client.Client;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

import java.net.Socket;

/**
 * This class is controller for .fxml document "ClientWindowFXML"
 * @author Nikita.Ustyushenko
 * @version 1.0
 * */
public class ClientWindowController {

    /** Property - client */
    private Client client;

    /** Property - socket */
    private Socket socket;

    @FXML
    private TextArea text_area;

    @FXML
    private TextField text_field;

    @FXML
    private Button button_send;

    @FXML
    private Button button_exit;

    @FXML
    private void initialize() {

        // set focus false for text area
        this.text_area.setFocusTraversable(false);

        // block text area
        this.text_area.setEditable(false);

        // make event for press key "Down" for text area
        this.text_area.setOnKeyPressed( event -> {

            if (event.getCode() == KeyCode.DOWN) this.text_field.requestFocus();
            else ;

        });

        // make event for press keys for text field
        this.text_field.setOnKeyPressed( event -> {

            if (event.getCode() == KeyCode.RIGHT) this.button_send.requestFocus();
            else if (event.getCode() == KeyCode.ENTER) this.send();
            else ;

        });

        // make event for press key "Enter" for button "Send"
        this.button_send.setOnKeyPressed( event -> {

            if (event.getCode() == KeyCode.ENTER) this.send();
            else ;

        });

        // make event for press key "Enter" for button "Exit"
        this.button_exit.setOnKeyPressed( event -> {

            if (event.getCode() == KeyCode.ENTER) this.button_exit.getScene().getWindow().hide();
            else ;

        });

        // set event for button "Exit"
        this.button_exit.setOnAction(event -> this.button_exit.getScene().getWindow().hide());

        // set event for button "Send"
        this.button_send.setOnAction( event -> this.send() );


    }

    /**
     * This method print message in text area
     *
     * */
    public void send() {

        if (!this.text_field.getText().trim().equals("")) {

            this.text_area.appendText(this.client.getClientName() + ": " + this.text_field.getText().trim() + "\n");
            this.text_field.clear();

        }
        else ;

    }

    /**
     * This method return value of the property client
     * @return value of the property client
     * */
    public Client getClient() {

        return this.client;

    }

    /**
     * This method set value of the property client
     * @param client value of the object Client
     * */
    public void setClient(Client client) {

        this.client = client;
        this.text_area.appendText(this.client.getClientName() + " connected...\n");

    }

    /**
     * This method return value of the property socket
     * @return value of the property socket
     * */
    public Socket getSocket() {

        return this.socket;

    }

    /**
     * This method set value of the property socket
     * @param socket value of the object Socket
     * */
    public void setSocket(Socket socket) {

        this.socket = socket;

    }

}
