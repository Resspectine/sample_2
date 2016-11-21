package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.io.IOException;

public class Controller {
    public Button button;
    public Button buttonBack;
    public TextArea chat;
    public TextField chatText;
    public String message = "";
    public Alert alert = new Alert(Alert.AlertType.INFORMATION);

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

        alert.showAndWait();
    }
}