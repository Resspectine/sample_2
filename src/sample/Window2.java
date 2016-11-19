package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Window2 {

    public Window2() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Window 2");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }
}
