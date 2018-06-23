package clientwindow;

import client.Client;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * This class make client window
 * @author Nikita.Ustyushenko
 * @version 1.0
 * */
public class ClientWindow extends Stage {

    /** Final property - TITLE_WINDOW */
    private final String TITLE_WINDOW;

    /** Property - client */
    private Client client;

    /** Property - anchor_pane */
    private AnchorPane anchorPane;

    // block for initialize final property
    { this.TITLE_WINDOW = new String("Chat"); }

    /**
     * Make client window
     * */
    public ClientWindow() {

        this.client = null;
        this.anchorPane = null;

    }

    /**
     * Make client window
     * @param client value of the object Client
     * */
    public ClientWindow(Client client) {

        try {

            this.anchorPane = (AnchorPane) FXMLLoader.load(getClass().getResource("ClientWindowFXML.fxml"));

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
