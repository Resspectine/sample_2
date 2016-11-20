package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        primaryStage.setTitle("Есть МОЙ ХУЙ");
        primaryStage.setScene(new Scene(root, 650, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}