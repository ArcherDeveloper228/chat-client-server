package clientwindow;

import client.Client;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.Socket;

/**
 * This class make client window
 * @author Nikita.Ustyushenko
 * @version 1.0
 * */
public class ClientWindow extends Stage implements ClientWindowInterface {

    /** Property - clientWindowController */
    private ClientWindowController clientWindowController;

    /** Property - anchor_pane */
    private AnchorPane anchorPane;

    /**
     * Make client window
     * */
    public ClientWindow() {

        this.clientWindowController = null;
        this.anchorPane = null;

    }

    /**
     * Make client window
     * @param client value of the object Client
     * */
    public ClientWindow(Client client, Socket socket) {

        try {

            FXMLLoader loader = new FXMLLoader(ClientWindow.class.getResource("ClientWindowFXML.fxml"));

            this.anchorPane = (AnchorPane) loader.load();

            this.clientWindowController = loader.<ClientWindowController>getController();
            this.clientWindowController.setClient(client);
            this.clientWindowController.setSocket(socket);

            super.setScene(new Scene(this.anchorPane));
            super.setResizable(false);
            super.setTitle(this.TITLE_WINDOW);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * This method return value of the property anchorPane
     * @return value of the property anchorPane
     * */
    public AnchorPane getAnchorPane() {

        return this.anchorPane;

    }

    /**
     * This method set value of the property anchorPane
     * @param anchorPane value of the object AnchorPane
     * */
    public void setAnchorPane(AnchorPane anchorPane) {

        this.anchorPane = anchorPane;

    }

}
