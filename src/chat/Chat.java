package chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

public class Chat extends AnchorPane implements Initializable {
    @FXML
    private TextArea chat;
    @FXML
    private TextField chatField;
    @FXML
    private Button sendText;
    private LinkedList<String> messages;

    public Chat() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("chat.fxml"));
        fxmlLoader.setController(this);
        fxmlLoader.setRoot(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        chat.setText("");
        chatField.setText("");
        sendText.setText("Отправить");
        messages = new LinkedList<>();
    }

    public void sendMessage(ActionEvent actionEvent) {
        if (!chatField.getText().equals("")) {
            String str = chatField.getText();
            messages.add(str);
            chat.appendText(str + "\n");
            chatField.clear();
        }
    }

    public void handleEnterPressed(KeyEvent keyEvent) {
        if (!chatField.getText().equals("")) {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                String str = chatField.getText();
                messages.add(str);
                chat.appendText(str + "\n");
                chatField.clear();
            }
        }
    }
}
