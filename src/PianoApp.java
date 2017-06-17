import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by account2 on 2017-04-08.
 */

public class PianoApp extends Application {
    public void start(Stage primaryStage) {
        PianoView pView = new PianoView();
        primaryStage.setTitle("Piano App");
        primaryStage.setResizable(true);
        primaryStage.setScene(new Scene(pView, 285, 205));
        primaryStage.show();
//lets see if it picks up this


    }

    public static void main(String[] args) {
        launch(args);
    }
}

