package client;

import clientwindow.ClientWindow;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.Socket;

/**
 * This class is controller for .fxml document "ConnectWindowFXML"
 * @author Nikita.Ustyushenko
 * @version 1.0
 * */
public class ConnectWindowController implements ConnectWindowInterface {

    @FXML
    private TextField textName;

    @FXML
    private TextField textIp;

    @FXML
    private TextField textPort;

    @FXML
    private Button buttonConnect;

    @FXML
    private void initialize() {

        // make event for button "Connect"
        this.buttonConnect.setOnAction(event -> {

            Socket socket = null;
            Client client = null;
            String clientName = null;
            String ip = null;
            int port = 0;

            // check for empty fields
            if (!this.textName.getText().trim().equals("") && !this.textIp.getText().trim().equals("") &&
                    !this.textPort.getText().trim().equals("")) {

                try {

                    // initialize objects
                    port = Integer.parseInt(this.textPort.getText().trim());
                    clientName = this.textName.getText().trim();
                    ip = this.textIp.getText().trim();

                    // make new object Client
                    client = new Client(clientName, ip, port);

                    // perform a test connection
                    socket = new Socket(ip, port);

                    // close window
                    this.buttonConnect.getScene().getWindow().hide();

                    // make and show client window
                    new ClientWindow(client).show();

                } catch (IllegalArgumentException e1) {
                    ConnectWindowController.showDialogMessage(ERROR, ERRORS[0]);
                    e1.printStackTrace();
                } catch (IOException e2) {
                    ConnectWindowController.showDialogMessage(ERROR, ERRORS[1]);
                    e2.printStackTrace();
                }

            } else ConnectWindowController.showDialogMessage(ERROR, ERRORS[2]);

        });

    }

    /**
     * This method show dialog window
     * @param title value of the object String
     * @param message value of the object String
     * */
    public static void showDialogMessage(String title, String message) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();

    }

}
