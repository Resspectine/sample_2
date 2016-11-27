package player;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PlayerGuesser extends AnchorPane implements Initializable {

    @FXML
    public Button checkContact;
    @FXML
    public Button sendAssumption;
    @FXML
    public TextField textAssumption;

    public String riddleWord;
    public String checkRiddleWord;

    public PlayerGuesser() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("playerGuesser.fxml"));
        fxmlLoader.setController(this);
        fxmlLoader.setRoot(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendRiddlerWord(ActionEvent actionEvent) {
        if (!textAssumption.getText().equals("")) {
            riddleWord = textAssumption.getText();
            textAssumption.clear();
        }
    }

    public void checkRiddlerWord(ActionEvent actionEvent) {
        if (!textAssumption.getText().equals("")) {
            checkRiddleWord = textAssumption.getText();
            textAssumption.clear();
        }
        if(riddleWord.equals(checkRiddleWord)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Поздравляю!");
            alert.setHeaderText(null);
            alert.setContentText("Вы угадали");
            alert.show();
        }
    }
    public void handleEnterPressed(KeyEvent keyEvent) {
        if (!textAssumption.getText().equals("")) {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                riddleWord = textAssumption.getText();
                textAssumption.clear();
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textAssumption.setText("");
        checkContact.setText("Есть контакт");
        sendAssumption.setText("Сделать предположение");
        riddleWord = "";
    }
}