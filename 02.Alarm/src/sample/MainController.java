package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainController {

    @FXML
    private VBox alarmsVBox;

    private List<Alarm> alarmList = new ArrayList<>();

    @FXML
    public void addAlarm() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addAlarmView.fxml"));
        VBox vBox = fxmlLoader.load();
        Scene scene = new Scene(vBox);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setResizable(false);
        stage.setScene(scene);
        AddAlarmController addAlarmController = fxmlLoader.getController();
        addAlarmController.setMainController(this);
        stage.show();
    }

    @FXML
    public void closeApp() {
        Platform.exit();
    }

    public void add(Alarm a) {
        alarmList.add(a);
        Label label = new Label(a.toString());
        label.setPrefWidth(300);
        alarmsVBox.getChildren().add(label);
    }
}
