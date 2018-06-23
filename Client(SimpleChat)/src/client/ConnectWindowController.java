package client;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * This class is controller for .fxml document "ConnectWindowFXML"
 * @author Nikita.Ustyushenko
 * @version 1.0
 * */
public class ConnectWindowController {

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

            if (!this.textName.getText().trim().equals("") && !this.textIp.getText().trim().equals("") &&
                    !this.textPort.getText().trim().equals("")) {



            } else {



            }

        });

    }

}
