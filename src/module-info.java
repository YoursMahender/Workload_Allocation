module WorkLoad_Allocation {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	requires jdk.internal.le;
	
	opens application to javafx.graphics, javafx.fxml;
	opens FirstApplication to javafx.graphics, javafx.fxml;
}
