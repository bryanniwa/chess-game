package ca.bryanniwa.chess_game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BoardUi extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello world");

        VBox vbox = new VBox(label);

        Scene scene = new Scene(vbox, 100, 100);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
