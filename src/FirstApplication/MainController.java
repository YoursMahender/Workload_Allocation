package FirstApplication;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class MainController {

    @FXML
    private Button NewStaffButton;
    
    public void NewStaffButtonListener(ActionEvent e) throws IOException {
    	Parent parent = FXMLLoader.load(
	               getClass().getResource("NewStaff.fxml")); 
	      
	      // Build the scene graph.
	      Scene scene = new Scene(parent); 
	
	      Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
	      // Display our window, using the scene graph.
	      stage.setTitle("NewStaff"); 
	      stage.setScene(scene);
	      stage.show(); 
    }
    
    @FXML
    private Button ViewStaffButton;    

    @FXML
    private Button AssignButton;
    
    @FXML
    private Button WorkLoadButton;
}

