package gui;

import guii.util.Alerts;
import guii.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    /// Declaring an attribute in JavaFX
    @FXML
    private Button btTest;

    @FXML
    private TextField txtNumberOne;

    @FXML
    private TextField txtNumberTwo;

    @FXML
    private Label labelResult;

    @FXML
    private Button btSum;

    @FXML
    private Button btSub;

    @FXML
    private Button btMulti;

    @FXML
    private Button btDivision;

    @FXML
    public void onBtSum(){
        try {
            Locale.setDefault(Locale.US);
            double numberOne = Double.parseDouble(txtNumberOne.getText());
            double numberTwo = Double.parseDouble(txtNumberTwo.getText());
            double sum = numberOne + numberTwo;
            labelResult.setText(String.format("%.2f", sum));
        } catch(NumberFormatException e) {
            Alerts.showAlert("Error", null, e.getMessage(), Alert.AlertType
            .ERROR);
        }
    }

    @FXML
    public void onBtSubtraction(){
        try {
            Locale.setDefault(Locale.US);
            double numberOne = Double.parseDouble(txtNumberOne.getText());
            double numberTwo = Double.parseDouble(txtNumberTwo.getText());
            double subtraction = numberOne - numberTwo;
            labelResult.setText(String.format("%.2f", subtraction));
        } catch(NumberFormatException e) {
            Alerts.showAlert("Error", null, e.getMessage(), Alert.AlertType
                    .ERROR);
        }
    }

    @FXML
    public void onBtMultiplication(){
        try {
            Locale.setDefault(Locale.US);
            double numberOne = Double.parseDouble(txtNumberOne.getText());
            double numberTwo = Double.parseDouble(txtNumberTwo.getText());
            double multiplication = numberOne * numberTwo;
            labelResult.setText(String.format("%.2f", multiplication));
        } catch(NumberFormatException e) {
            Alerts.showAlert("Error", null, e.getMessage(), Alert.AlertType
                    .ERROR);
        }
    }

    @FXML
    public void onBtDivision(){
        try {
            Locale.setDefault(Locale.US);
            double numberOne = Double.parseDouble(txtNumberOne.getText());
            double numberTwo = Double.parseDouble(txtNumberTwo.getText());
            if (numberTwo != 0) {
                double division = numberOne / numberTwo;
                labelResult.setText(String.format("%.2f", division));
            }
        } catch (ArithmeticException | NumberFormatException e){
            Alerts.showAlert("Error", null, e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Constraints.setTextFieldDouble(txtNumberOne);
        Constraints.setTextFieldDouble(txtNumberTwo);
        Constraints.setTextFieldMaxLength(txtNumberOne, 12);
        Constraints.setTextFieldMaxLength(txtNumberOne, 12);

    }
}
