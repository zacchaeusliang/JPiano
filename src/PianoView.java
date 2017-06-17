/**
 * Created by account2 on 2017-04-08.
 */

import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import org.jfugue.player.Player;

import javafx.event.ActionEvent;

public class  PianoView extends Pane {


    public PianoView() {
        GridPane aPane = new GridPane();
        Player player = new Player();
        
        aPane.setPadding(new Insets(10, 10, 10, 10));
        aPane.setHgap(1);
        aPane.setVgap(1);
        String [] notes={"A4","B4b","B5","D5b","D5","Eb","E5","F5","G5b","A6"};

        for (int row = 1; row < 10; row++) {
            Button b = new Button();
            b.setPrefWidth(50);
            b.setPrefHeight(50);

            b.setStyle("-fx-base: WHITE;");
           b.setText(notes[row]);
           b.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent event) {
                    player.play(b.getText());
                }
            });


            aPane.add(b,  row,0);




        }
        getChildren().add(aPane);
        update();
    }

    public void update() {

    }
}
