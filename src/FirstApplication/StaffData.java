package FirstApplication;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StaffData {

	private static final ObservableList<Staff> staffList = FXCollections.observableArrayList();

   
    public static ObservableList<Staff> getStaffList() {
        return staffList;
    } 
    
    public static void addStaff(Staff staff) {
        staffList.add(staff);
    }

}

