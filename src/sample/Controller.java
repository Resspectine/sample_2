package sample;

import chat.Chat;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

public class Controller {
    public Button button;
    public Button buttonBack;
    public TextArea chat;
    public TextField chatText;
    public String message = "";
    public Alert alert = new Alert(Alert.AlertType.INFORMATION);
    public Chat chatBox;

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

    public void sendTextInChat(ActionEvent actionEvent) {
        if (!chatText.getText().equals("")) {
            message += chatText.getText() + "\n";
            chat.setText(message);
            chatText.setText("");
        }
    }

    public void handleEnterPressed(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            if (!chatText.getText().equals("")) {
                message += chatText.getText() + "\n";
                chat.setText(message);
                chatText.setText("");
            }
        }
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