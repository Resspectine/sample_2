package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {
    public Button button;
    public Button buttonBack;
    public TextArea chat;
    public TextField chatText;
    public String message = "";

    public void zagadivat(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("simple1.fxml"));
        button.getScene().setRoot(root);
    }

    public void otgadivat(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        button.getScene().setRoot(root);
    }

    public void back(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample1.fxml"));
        buttonBack.getScene().setRoot(root);
    }

    public void sendText(ActionEvent actionEvent) {
        if (!chatText.getText().equals("")) {
            message += chatText.getText() + "\n";
            chat.setText(message);
            chatText.setText("");
        } else {
        }
    }
   /* scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
        @Override
        public void handle(KeyEvent event) {
            switch (event.getCode()) {
                case UP: goNorth = true; break;
                case DOWN: goSouth = true; break;
                case LEFT: goWest = true; break;
                case RIGHT: goEast = true; break;
                case SHIFT: running = true; break;
            }
        }
    });*/
}