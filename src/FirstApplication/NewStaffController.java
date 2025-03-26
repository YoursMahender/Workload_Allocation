package FirstApplication;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewStaffController {

    @FXML
    private TextField idfield, managerfield, namefield;
//
    @FXML
    private Button savebutton;
//    
    @FXML
    private Button backButton;
    
    @FXML
    private ChoiceBox<String> worktypechoice;

    @FXML
    public void initialize() {
        worktypechoice.getItems().addAll("Full Time", "Part Time");
    }
    

    @FXML
    private void onSaveButtonClick() {
        String name = namefield.getText();
        String id = idfield.getText();
        String manager = managerfield.getText();
        String workType = worktypechoice.getValue();

        if (name.isEmpty() || id.isEmpty() || manager.isEmpty() || workType == null) { 
            showAlert("Error,Please fill all the fields");
        	// System.out.println("All fields are required!");
        	return;
        }

 // Add staff to shared data
    Staff newStaff = new Staff(name, id, manager, workType, workType, 0);
    StaffData .addStaff(newStaff);

    showAlert("Staff added successfully!");
    clearFields();
    }

@FXML 
private void clearFields() {
    namefield.clear();
    idfield.clear();
    managerfield.clear();
    worktypechoice.getSelectionModel().clearSelection();
}

private void showAlert(String message) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Info");
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.showAndWait();
}
@FXML
private void goBackToMain() throws IOException {
    
    Stage stage = (Stage) backButton.getScene().getWindow();

    // Load Main.fxml
    Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

    // Set the new scene
    stage.setScene(new Scene(root, 400, 200));
    stage.show();
}
    
}
    

    
    
