package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainWindowController extends LeaseRightController {

	@FXML
	private Button _manageLeasesButton;
	@FXML
	private Button _manageEquipmentButton;
	@FXML
	private Button _manageCustomersButton;
	@FXML
	private Button _manageEmployeesButton;
	
	@FXML
	public void handleManageLeasesClick() {
		Context.getInstance().setView("Leases");
		
		Stage stage = (Stage) _manageLeasesButton.getScene().getWindow(); // Get current stage
		changeWindow("ListView.fxml", stage); // Change to ListView.fxml view
	}
	
	@FXML
	public void handleManageEquipmentClick() {
		Context.getInstance().setView("Equipment");
		
		Stage stage = (Stage) _manageEquipmentButton.getScene().getWindow(); // Get current stage
		changeWindow("ListView.fxml", stage); // Change to ListView.fxml view
	}
	
	@FXML
	public void handleManageCustomersClick() {
		Context.getInstance().setView("Customers");
		
		Stage stage = (Stage) _manageCustomersButton.getScene().getWindow(); // Get current stage
		changeWindow("ListView.fxml", stage); // Change to ListView.fxml view
	}
	
	@FXML
	public void handleManageEmployeesClick() {
		Context.getInstance().setView("Employees");
		
		Stage stage = (Stage) _manageEmployeesButton.getScene().getWindow(); // Get current stage
		changeWindow("ListView.fxml", stage); // Change to ListView.fxml view
	}
}
