package FirstApplication;

import javafx.fxml.FXML;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {
	
	

	@FXML
	private Button AssignButton;
	
	@FXML
	private Button WorkLoadButton;
	

	
    @FXML
    private Button NewStaffButton;
    
    
    
    public void NewStaffButtonListener(@SuppressWarnings("exports") ActionEvent e) throws IOException {
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
	      
	      
	      public void AssignButtonListener(@SuppressWarnings("exports") ActionEvent e) throws IOException {
	      	Parent parent = FXMLLoader.load(
	  	               getClass().getResource("AssignWork.fxml")); 
	  	      
	  	      // Build the scene graph.
	  	      Scene scene = new Scene(parent); 
	  	
	  	      Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
	  	      // Display our window, using the scene graph.
	  	      stage.setTitle("Assigning"); 
	  	      stage.setScene(scene);
	  	      stage.show(); 
	      
	      
	      
    }
        
    @FXML
    private Button ViewStaffButton;  
    
    public void ViewStaffButtonListener(@SuppressWarnings("exports") ActionEvent e) throws IOException{
    	Parent parent = FXMLLoader.load(
    			getClass().getResource("ViewStaff.fxml"));
    	
    	Scene scene = new Scene(parent);
    	
    	Stage stage =(Stage) ((Node) e.getSource()).getScene().getWindow();
    	
    	stage.setTitle("View Staff");
    	stage.setScene(scene);
    	stage.show();
    }
    
    

   
}

