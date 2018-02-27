package mikkelkuntz;

//https://stackoverflow.com/questions/20497845/constantly-update-ui-in-java-fx-worker-thread

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class PrimarySceneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonBatFolder;

    @FXML
    private Button buttonPoE;

    @FXML
    private Button buttonRL;

    @FXML
    private Label labelPingGoogle;

    @FXML
    private Label labelPingRouter;


    @FXML
    public void initialize() {
        assert buttonBatFolder != null : "fx:id=\"buttonBatFolder\" was not injected: check your FXML file 'PrimaryScene.fxml'.";
        assert buttonPoE != null : "fx:id=\"buttonPoE\" was not injected: check your FXML file 'PrimaryScene.fxml'.";
        assert buttonRL != null : "fx:id=\"buttonRL\" was not injected: check your FXML file 'PrimaryScene.fxml'.";
        assert labelPingGoogle != null : "fx:id=\"labelPingGoogle\" was not injected: check your FXML file 'PrimaryScene.fxml'.";
        assert labelPingRouter != null : "fx:id=\"labelPingRouter\" was not injected: check your FXML file 'PrimaryScene.fxml'.";

        pingRouter();

    }

    @FXML
    public void openRL(javafx.event.ActionEvent event) {
        //TODO: Opens Rocket League
        //start steam://rungameid/252950

        /*
        try {
            Runtime.getRuntime().exec("ping");
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        /*
        try {
            Process process = new ProcessBuilder("start steam://rungameid/252950").start();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Process p = pb.start();
           */
    }

    @FXML
    public void openPoE(javafx.event.ActionEvent event) {
        //TODO: Opens Path of Exile
        //start steam://rungameid/238960
    }

    @FXML
    public void pingRouter(){
        //TODO : Create
        //https://www.mkyong.com/java/how-to-execute-shell-command-from-java/
        //MAYBE ANTOHER SOURCE?

        //System.out.println("This is pingRouter");

        int i = 0;

        while(true){
            final int finalI = i;
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    labelPingRouter.setText("" + finalI);
                }
            });
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
