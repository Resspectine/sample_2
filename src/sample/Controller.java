package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public TextField getText;
    public TextArea setText;
    public int version;
    public void getText(ActionEvent actionEvent) {
        String str = getText.getText();
        setText.setText(str);
    }

    public void zagadivat(ActionEvent actionEvent) throws Exception {
        new Window2();
    }

    public void otgadivat(ActionEvent actionEvent) {
    }
}
