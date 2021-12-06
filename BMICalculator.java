package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class BMICalculator {

    @FXML
    private TextField weightInput;

    @FXML
    private Button BMICalculateButton;

    @FXML
    private TextField heightInput;

    @FXML
    private TextField BMIValue;

    @FXML
    private TextField BMIStatus;

    @FXML
    void Calculate(ActionEvent event) {
    	
    	try {
    		
	    	Double weight = Double.parseDouble(weightInput.getText());
	    	Double height = Double.parseDouble(heightInput.getText());
	    	Double bmiValue = weight/((height/100)*(height/100));
	    	
	    	weightInput.clear();
	    	heightInput.clear();
	    	setBMI(bmiValue);
    	} catch(Exception e) {
    		e.printStackTrace();
    	}

    }
    
    void setBMI(Double bmiValue) {
    	
    	BMIValue.setText(bmiValue.toString());
    	
    	if(bmiValue <= 18.5) {
    		BMIStatus.setText("Underweight");
    	}
    	
    	else if(bmiValue >= 18.6 && bmiValue <= 24.9) {
    		BMIStatus.setText("Normal");
    	}
    	
    	else if(bmiValue >= 25 && bmiValue <= 29) {
    		BMIStatus.setText("Overweight");
    	}
    	
    	else
    		BMIStatus.setText("Obesity");
  
    }
    
   

}