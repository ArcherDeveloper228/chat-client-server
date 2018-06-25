package clientwindow;

import client.Client;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * This class is controller for .fxml document "ClientWindowFXML"
 * @author Nikita.Ustyushenko
 * @version 1.0
 * */
public class ClientWindowController {

    /** Property - client */
    private Client client;

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

        // set event for button "Exit"
        this.button_exit.setOnAction(event -> this.button_exit.getScene().getWindow().hide());

        // set event for button "Send"
        this.button_send.setOnAction(event -> {




        });


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

    }

}
