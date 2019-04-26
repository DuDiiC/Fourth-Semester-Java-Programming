package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField userName;

    @FXML
    private PasswordField passwordField;

    @FXML
    protected void signInClick(ActionEvent event) {
        System.out.println(userName.getText());
        System.out.println(passwordField.getText());
    }
}
