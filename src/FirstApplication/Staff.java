package FirstApplication;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Staff {
    private String name;
    private String id;
    private String manager;
    private String workType;
    private String assignedWork;
    private IntegerProperty hours = new SimpleIntegerProperty();


    // Constructor
    public Staff(String name, String id, String manager, String worktype, String assignedwork, int  hours) {
        this.name = name;
        this.id = id;
        this.manager = manager;
        this.workType = worktype;
        this.assignedWork = "No work assigned";
        this.hours.set(hours);
    }

    // Getters
    public String getName() { return name; }
    public String getId() { return id; }
    public String getManager() { return manager; }
    public String getWorkType() { return workType; }
    public String getAssignedWork() { return assignedWork; }
    public int getHours() { return hours.get();}
   
    
    public void setAssignedWork(String assignedwork) { this.assignedWork = assignedwork; }
    public void setHours(int hours) { this.hours.set(hours); 
    }
    public IntegerProperty hoursProperty() {
        return hours;
    }
}

