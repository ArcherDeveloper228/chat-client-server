package client;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * This class make connect window
 * @author Nikita.Ustyushenko
 * @version 1.0
 * */
public class ConnectWindow extends Stage implements ConnectWindowInterface {

    /** Property - anchorPane */
    private AnchorPane anchorPane;

    /**
     * Make connect window
     * */
    public ConnectWindow() {

        try {

            this.anchorPane = (AnchorPane) FXMLLoader.load(getClass().getResource("ConnectWindowFXML.fxml"));

            super.setScene(new Scene(this.anchorPane));
            super.setResizable(false);
            super.setTitle(TITLE_WINDOW);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
