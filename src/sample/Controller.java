package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;

public class Controller {
    public Button button;
    public Button buttonBack;

    public void zagadivat(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("simple1.fxml"));
        button.getScene().getWindow().setX(400);
        button.getScene().getWindow().setHeight(500);
        button.getScene().getWindow().setWidth(650);
        button.getScene().setRoot(root);
    }

    public void otgadivat(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        button.getScene().getWindow().setX(400);
        button.getScene().getWindow().setHeight(500);
        button.getScene().getWindow().setWidth(650);
        button.getScene().setRoot(root);
    }

    public void back(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample1.fxml"));
        buttonBack.getScene().getWindow().setX(400);
        buttonBack.getScene().getWindow().setHeight(100);
        buttonBack.getScene().getWindow().setWidth(200);
        buttonBack.getScene().setRoot(root);
    }
}
