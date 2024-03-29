package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class LeaseRightController {

	/**
	 * Changes the current view embedded in the desired stage. The fxml String points
	 * to the file desired to be the root of the new view, and the stage refers to 
	 * the main stage needing to be changed.
	 */
	protected void changeWindow(String fxmlFile, Stage stage) {
		Parent root = null;
		try {
			// Load root .fxml file for new view
			root = FXMLLoader.load(getClass().getResource(fxmlFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		double width = stage.getWidth();
		double height = stage.getHeight();
		
		Scene scene = new Scene(root, width, height); // Create new scene based off new view root
		stage.setScene(scene); // Set current stage to show new view scene
		stage.show();
		stage.setWidth(width);
		stage.setHeight(height);
}
}
