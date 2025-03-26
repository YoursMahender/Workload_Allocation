package FirstApplication;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ViewStaffController {
	
	 @FXML
	    private Button backButton2;

    @FXML
    private TableColumn<Staff, String> idcolumn1;

    @FXML
    private TableColumn<Staff, String> managercolumn1;

    @FXML
    private TableColumn<Staff, String> namecolumn1;
    
    @FXML
    private TableColumn<Staff, String> assignworkcolumn1;
    
    @FXML
    private TableColumn<Staff, Integer>hourscolumn1; 
    
    

    @FXML
    private TableView<Staff> stafftable;

    @FXML
    private TableColumn<Staff, String> worktypecolumn1;
    
    @FXML
    public void initialize() {
        // Set up table columns
        namecolumn1.setCellValueFactory(new PropertyValueFactory<>("name"));
        idcolumn1.setCellValueFactory(new PropertyValueFactory<>("id"));
        managercolumn1.setCellValueFactory(new PropertyValueFactory<>("manager"));
        worktypecolumn1.setCellValueFactory(new PropertyValueFactory<>("workType"));
        assignworkcolumn1.setCellValueFactory(new PropertyValueFactory<>("assignedWork"));
        hourscolumn1.setCellValueFactory(new PropertyValueFactory<>("Hours"));
        
        ObservableList<Staff> staffList =  FXCollections.observableArrayList(StaffData.getStaffList());
        stafftable.setItems(staffList);
    }
    
    
    
    @FXML
    private void goBackToMain() throws IOException {
        
        Stage stage = (Stage) backButton2.getScene().getWindow();

        // Load Main.fxml
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

        // Set the new scene
        stage.setScene(new Scene(root, 400, 200));
        stage.show();
    }
}
