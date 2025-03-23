package FirstApplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class NewStaffController {

    @FXML
    private TextField idfield;

    @FXML
    private TextField managerfield;

    @FXML
    private TextField namefield;

    @FXML
    private Button savebutton;

    @FXML
    private ChoiceBox<String> worktypechoice;
    
    
    @FXML
    private void initialize() {
        worktypechoice.getItems().addAll("Full-Time", "Part-Time");
    }

//    @FXML
//    private void saveEmployee() {
//        String name = namefield.getText();
//        String id = idfield.getText();
//        String manager = managerfield.getText();
//        String workType = worktypechoice.getValue();
//
//        System.out.println("Employee Saved: " + name + ", ID: " + id + ", Manager: " + manager + ", Work Type: " + workType);
//    }
}
    
    
