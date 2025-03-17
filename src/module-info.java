module WorkLoad_Allocation {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
	opens FirstApplication to javafx.graphics, javafx.fxml;
}
