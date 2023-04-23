module java_fx.bmi_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens java_fx.bmi_calculator to javafx.fxml;
    exports java_fx.bmi_calculator;
}