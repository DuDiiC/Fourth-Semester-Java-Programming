package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private TextArea textArea = new TextArea("");

    @FXML
    protected void clickZero(ActionEvent event) {
        textArea.setText(textArea.getText() + 0);
    }

    @FXML
    protected void clickOne(ActionEvent event) {
        textArea.setText(textArea.getText() + 1);
    }

    @FXML
    protected void clickTwo(ActionEvent event) {
        textArea.setText(textArea.getText() + 2);
    }

    @FXML
    protected void clickThree(ActionEvent event) {
        textArea.setText(textArea.getText() + 3);
    }

    @FXML
    protected void clickFour(ActionEvent event) {
        textArea.setText(textArea.getText() + 4);
    }

    @FXML
    protected void clickFive(ActionEvent event) {
        textArea.setText(textArea.getText() + 5);
    }

    @FXML
    protected void clickSix(ActionEvent event) {
        textArea.setText(textArea.getText() + 6);
    }

    @FXML
    protected void clickSeven(ActionEvent event) {
        textArea.setText(textArea.getText() + 7);
    }

    @FXML
    protected void clickEight(ActionEvent event) {
        textArea.setText(textArea.getText() + 8);
    }

    @FXML
    protected void clickNine(ActionEvent event) {
        textArea.setText(textArea.getText() + 9);
    }

    @FXML
    protected void clickPlus(ActionEvent event) {
        textArea.setText(textArea.getText() + "+");
    }

    @FXML
    protected void clickMinus(ActionEvent event) {
        textArea.setText(textArea.getText() + "-");
    }

    @FXML
    protected void clickMultiply(ActionEvent event) {
        textArea.setText(textArea.getText() + "x");
    }

    @FXML
    protected void clickDivide(ActionEvent event) {
        textArea.setText(textArea.getText() + "/");
    }

    @FXML
    protected void clickEqual(ActionEvent event) {
        textArea.setText(calculate(textArea.getText()));
    }

    @FXML
    protected void clickReset(ActionEvent event) {
        textArea.setText("");
    }

    private String calculate(String operation) {

        String[] numbers = operation.split("[-x/\\+]");
        String[] operations = operation.split("[0-9]+");

        int result = Integer.parseInt(numbers[0]);
        for(int i = 1, j = 0; i < numbers.length-1 || j < operations.length; ) {
            switch (operations[j]) {
                case "+":
                    result += Integer.parseInt(numbers[i]);
                    i++;
                    break;
                case "-":
                    result -= Integer.parseInt(numbers[i]);
                    i++;
                    break;
                case "x":
                    result *= Integer.parseInt(numbers[i]);
                    i++;
                    break;
                case "/":
                    result /= Integer.parseInt(numbers[i]);
                    i++;
            }
            j++;
        }

        return String.valueOf(result);
    }

}
