package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {

    @FXML
    private TextArea textArea;

    @FXML
    protected void saveToFile(ActionEvent event) {
        try {
            FileWriter fileWriter = new FileWriter(new File("data.txt"));
            fileWriter.write(textArea.getText());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
