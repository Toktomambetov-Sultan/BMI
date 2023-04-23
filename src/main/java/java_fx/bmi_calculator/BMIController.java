package java_fx.bmi_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
public class BMIController {


    @FXML
    private Label ScaleLabel;
    @FXML
    private TextField IBMInput;

    @FXML
    private TextField heightInput;

    @FXML
    private TextField statusInput;

    @FXML
    private TextField weightInput;
    @FXML
    private RadioButton MetricOption;
    @FXML
    private RadioButton EnlishOption;
    private boolean with_k = false;
    @FXML
    public void initialize(){
    }
    @FXML
    void RadioSelected(ActionEvent event) {
        this.with_k = !with_k;
        if(with_k)
            ScaleLabel.setText("Metric");
            else ScaleLabel.setText("English");
    }

    @FXML
    void ButtonPressed(ActionEvent event) {
        double weight;
        double height;
        try{
            weight = Double.parseDouble(weightInput.getText());
        }catch (Exception e){
            weightInput.setText("Enter number");
            weightInput.selectAll();
            return;
        }
        try{
            height = Double.parseDouble(heightInput.getText());
        }catch (Exception e){
            heightInput.setText("Enter number");
            heightInput.selectAll();
            return;
        }
        int k =  with_k?703:1;
        double IBM = weight*k/ (Math.pow(height,2));
        IBMInput.setText(String.valueOf(IBM));
        if(IBM < 18.5)
            statusInput.setText("Underweight");
        else if (18.5<=IBM && IBM<=24.9) {
            statusInput.setText("Normal");
        }else if(25 <=IBM && IBM<=29.9) {
            statusInput.setText("Normal");
        }else statusInput.setText("Obese");

    }
}