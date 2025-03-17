package FirstApplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Button newstaffbutton;

     @FXML
   private Button viewstaffbutton;
   
    @FXML
     private Button assignbutton;

    @FXML
    private Button workloadbutton;
    
    @FXML
    private Label outputLabel;
    
    public void viewstaffbuttonlistener() {
    	outputLabel.setText("enter the details");
    }

}
