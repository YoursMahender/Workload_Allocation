package FirstApplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main extends Application {
	
	public void start(Stage stage) throws Exception
	{
		Parent parent = FXMLLoader.load(getClass().getResource("Main.fxml"));
		
		Scene scene= new Scene(parent);
		
		stage.setTitle("WorkLoad Allocation");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         launch(args);
	}

}
