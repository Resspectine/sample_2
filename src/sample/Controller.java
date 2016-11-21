package sample;

import chat.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {
    @FXML
    public Button button;
    @FXML
    public Button buttonBack;
    @FXML
    private TextArea chat;
    @FXML
    private TextField chatText;
    @FXML
    private Chat chatBox;

    public void guesse(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("riddler.fxml"));
        button.getScene().setRoot(root);
    }

    public void riddle(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("guesser.fxml"));
        button.getScene().setRoot(root);
    }

    public void back(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        buttonBack.getScene().setRoot(root);
    }

}