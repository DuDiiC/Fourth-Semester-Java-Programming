package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class Controller {

    @FXML
    private TextField nameTextField;

    @FXML
    private Label nameLabelOk;

    @FXML
    private TextField surnameTextField;

    @FXML
    private Label surnameLabelOk;

    @FXML
    private TextField birthYearTextField;

    @FXML
    private CheckBox confirmCheckBox;

    @FXML
    private Label ageLabel;

    @FXML
    private Button acceptButton;

    private PersonViewModel personViewModel = new PersonViewModel();

    @FXML
    protected void initialize() {

        /* name and surname bind */
        nameTextField.textProperty().bindBidirectional(personViewModel.getNameProperty());
        surnameTextField.textProperty().bindBidirectional(personViewModel.getSurnameProperty());

        /* turn off/on surname field value bind */
        surnameTextField.disableProperty().bind(personViewModel.getDisableSurnameProperty());

        /* birth year bind with StringConverter */
        StringConverter converter = new NumberStringConverter();
        birthYearTextField.textProperty().bindBidirectional(personViewModel.getBirthYearProperty(), converter);

        /* checkBox bind */
        confirmCheckBox.selectedProperty().bindBidirectional(personViewModel.getConfirmProperty());

        /* label for age bind */
        ageLabel.textProperty().bind(personViewModel.getAgeProperty());

        /* bind labels for name and surname OK */
        nameLabelOk.visibleProperty().bind(personViewModel.getNameOkProperty());
        surnameLabelOk.visibleProperty().bind(personViewModel.getSurnameOkProperty());

        /* turn off/on accept button bind */
        acceptButton.disableProperty().bind(personViewModel.getButtonProperty());
    }

    public void clickAcceptButton() {
        Platform.exit();
    }



}
