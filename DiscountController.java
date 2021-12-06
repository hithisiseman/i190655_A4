package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class DiscountController {

    @FXML
    private TextField originalpriceInput;

    @FXML
    private TextField discountInput;

    @FXML
    private TextField SaveOutput;

    @FXML
    private TextField FinalPriceOutput;

    @FXML
    private Button buttoncalculate;

    @FXML
    void calculate(ActionEvent event) {
    	
    	try {
    		
    		Double originalprice= Double.parseDouble(originalpriceInput.getText());
    		Double discount= Double.parseDouble(discountInput.getText());
    		Double finalprice= (originalprice * discount) / 100;
    		setPrice(finalprice);
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}

    }
    
    void setPrice(Double finalprice) {
    	
    	FinalPriceOutput.setText(finalprice.toString());
    	
    	
    }

}
