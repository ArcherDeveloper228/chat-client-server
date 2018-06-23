package clientwindow;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * This class make client window
 * @author Nikita.Ustyushenko
 * @version 1.0
 * */
public class ClientWindow extends Stage {

    /** Property - anchor_pane */
    private AnchorPane anchorPane;

    public ClientWindow() {


        super.setScene(new Scene(this.anchorPane));
        super.setResizable(false);


    }

}
