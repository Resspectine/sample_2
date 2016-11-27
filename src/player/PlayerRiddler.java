package player;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PlayerRiddler extends AnchorPane implements Initializable {
    @FXML
    public Button sendAssumption;
    @FXML
    public TextField textAssumption;
    @FXML
    public TextField textMainWord;
    @FXML
    public Button sendMainWord;

    public String mainWord;
    public String riddleWord;
    public String checkRiddleWord = "ку";

    public PlayerRiddler() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("playerRiddler.fxml"));
        fxmlLoader.setController(this);
        fxmlLoader.setRoot(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void checkRiddlerWord(ActionEvent actionEvent) {
        if (!textMainWord.getText().equals("")) {
            mainWord = textMainWord.getText();
            textMainWord.clear();
        }
    }

    public void handleEnterPressedOnMainField(KeyEvent keyEvent) {
        if (!textAssumption.getText().equals("")) {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                mainWord = textMainWord.getText();
                textMainWord.clear();
            }
        }
    }

    public void setMainWord(ActionEvent actionEvent) {
        if (!textAssumption.getText().equals("")) {
            riddleWord = textAssumption.getText();
            textAssumption.clear();
            if (riddleWord.equals(checkRiddleWord)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Поздравляю!");
                alert.setHeaderText(null);
                alert.setContentText("Вы угадали");
                alert.show();
            }
        }
    }

    public void handleEnterPressed(KeyEvent keyEvent) {
        if (!textAssumption.getText().equals("")) {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                riddleWord = textAssumption.getText();
                textAssumption.clear();
                if (riddleWord.equals(checkRiddleWord)) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Поздравляю!");
                    alert.setHeaderText(null);
                    alert.setContentText("Вы угадали");
                    alert.show();
                }
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textAssumption.setText("");
        sendMainWord.setText("Отправить слово");
        sendAssumption.setText("Сделать предположение");
        textMainWord.setText("");
        riddleWord = "";
    }
}