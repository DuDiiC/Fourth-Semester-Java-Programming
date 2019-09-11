package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class AddAlarmController implements Initializable {

    private MainController mainController;

    private List<String> dayList = new ArrayList<>();

    @FXML private TextField nameTextField;

    @FXML private ComboBox<String> hourComboBox;

    @FXML private ComboBox<String> minuteComboBox;

    @FXML private CheckBox repeat;

    @FXML private CheckBox mondayCheckBox;

    @FXML private CheckBox tuesdayCheckBox;

    @FXML private CheckBox wednesdayCheckBox;

    @FXML private CheckBox thursdayCheckBox;

    @FXML private CheckBox fridayCheckBox;

    @FXML private CheckBox saturdayCheckBox;

    @FXML private CheckBox sundayCheckBox;

    @FXML private Slider volumeSlider;

    @FXML private Label volumeLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ObservableList<String> hours = FXCollections.observableArrayList(
                "00", "01", "02", "03", "04", "05", "06", "07",
                "08", "09", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23");
        hourComboBox.setItems(hours);
        ObservableList<String> minutes = FXCollections.observableArrayList(
                "00", "01", "02", "03", "04", "05", "06", "07",
                "08", "09", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30", "31", "32", "33", "34",
                "35", "36", "37", "38", "39", "40", "41", "42", "43",
                "44", "45", "46", "47", "48", "49", "50", "51", "52",
                "53", "54", "55", "56", "57", "58", "59");
        minuteComboBox.setItems(minutes);

        volumeSlider.valueChangingProperty().addListener((observable, oldValue, newValue) ->
                volumeLabel.textProperty().setValue(
                    String.valueOf((int) volumeSlider.getValue())
                )
        );
    }

    @FXML
    private void addAlarm() {
        setDayList();
        mainController.add(new Alarm(nameTextField.getText(), hourComboBox.getValue()+":"+minuteComboBox.getValue(),
                dayList, repeat.isSelected(), (int) volumeSlider.getValue()));
        Stage stage = (Stage) nameTextField.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void cancel() {
        Stage stage = (Stage) nameTextField.getScene().getWindow();
        stage.close();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    private void setDayList() {
        if(mondayCheckBox.isSelected())     dayList.add("pn");
        if(tuesdayCheckBox.isSelected())    dayList.add("wt");
        if(wednesdayCheckBox.isSelected())  dayList.add("śr");
        if(thursdayCheckBox.isSelected())   dayList.add("czw");
        if(fridayCheckBox.isSelected())     dayList.add("pt");
        if(saturdayCheckBox.isSelected())   dayList.add("sb");
        if(sundayCheckBox.isSelected())     dayList.add("nd");
    }
}
