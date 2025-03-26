package FirstApplication;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AssignWorkController {
	
	@FXML
	private Button backbutton3;

    @FXML
    private Button assignbutton;

    @FXML
    private ComboBox<Staff> staffID;

    @FXML
    private TextField tasks;

    @FXML
    private TextField workinghours;
    
    @FXML
    public void initialize() {
        // Load staff list into ComboBox
        staffID.getItems().addAll(StaffData.getStaffList());
        staffID.setPromptText("Select Staff");
    }

    @FXML
    private void assignButtonClick() {
        Staff selectedStaff = staffID.getSelectionModel().getSelectedItem();
        String work = tasks.getText();
        String hours = workinghours.getText();
        
        
        if (selectedStaff == null || work.isEmpty() || hours.isEmpty()) {
            showAlert("Error", "Please select a staff member and enter work.");
            return;
        }

        // Assign work to staff member
        selectedStaff.setAssignedWork(work);
        showAlert("Success", "Work assigned to " + selectedStaff.getName() + ".");

//        try {
//            int hours = Integer.parseInt(hours);
//            selectedStaff.setAssignedWork(work);
//            selectedStaff.setWorkingHours(hours);
//            showAlert("Success", "Work assigned to " + selectedStaff.getName() + ".");
//        } catch (NumberFormatException e) {
//            showAlert("Error", "Working hours must be a number.");
//        }
        
        // Clear input
        staffID.getSelectionModel().clearSelection();
        tasks.clear();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
    
    @FXML
    private void goBackToMain() throws IOException {
        
        Stage stage = (Stage) backbutton3.getScene().getWindow();

        // Load Main.fxml
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

        // Set the new scene
        stage.setScene(new Scene(root, 400, 200));
        stage.show();
    }

}
