package sample;

import chat.Chat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import player.PlayerGuesser;
import player.PlayerRiddler;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

public class Controller {
    @FXML
    public Button button;
    @FXML
    public Button buttonBack;
    @FXML
    public Alert alert = new Alert(Alert.AlertType.INFORMATION);
    @FXML
    public Chat chatBox;
    @FXML
    public PlayerGuesser guesseBox;
    @FXML
    public PlayerRiddler riddleBox;

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

    public void openDialogPane(ActionEvent actionEvent) {
        alert.setTitle("Подсказочка");
        alert.setHeaderText("Это ваш IP адресс");
        alert.setContentText("ЗДЕСЬIPАДРЕСС");
        StringSelection ss = new StringSelection(alert.getContentText());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        alert.showAndWait();
    }
}