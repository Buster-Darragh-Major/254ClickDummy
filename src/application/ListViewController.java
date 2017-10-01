package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ListViewController extends LeaseRightController implements Initializable {

	ArrayList<String> _leaseContent = new ArrayList<String>(Arrays.asList(
			
	));
	ArrayList<String> _equipmentContent = new ArrayList<String>(Arrays.asList(
		
	));
	ArrayList<String> _customerContent = new ArrayList<String>(Arrays.asList(
		
	));
	ArrayList<String> _employeeContent = new ArrayList<String>(Arrays.asList(
			"Aharon, Ravid; 1234; ravidaharon@gmail.com",
			"Cairns, Nathan; 4567; nathancairns@hotmail.com",
			"Raitava-Kumar, Cyrus; 7890; kumz@emailadress.ac.nz",
			"Huxford, Zach; 8765, zachbwh@lol.co.nz"
	));
	
	/* FXML Nodes */
	@FXML
	private Button _mainMenuButton;
	@FXML
	private Button _searchButton;
	@FXML
	private Button _deleteButton;
	@FXML
	private Button _updateButton;
	@FXML
	private Button _addButton;
	@FXML
	private Label _listLabel;
	@FXML
	private ListView<String> _listView;
	
	@FXML
	public void handleMainMenuClick() {
		Stage stage = (Stage) _mainMenuButton.getScene().getWindow(); // Get current stage
		changeWindow("MainWindow.fxml", stage); // Change to LevelSelectWindow.fxml view
	}
	
	@FXML
	public void handleSearchClick() {
		
	}
	
	@FXML
	public void handleDeleteClick() {
		try {
			_listView.getSelectionModel().getSelectedItem();
			
			Alert deletePopup = new Alert(AlertType.CONFIRMATION);
			deletePopup.setTitle("Delete Creation");
			deletePopup.setHeaderText(null);
			deletePopup.setContentText("Are you sure you wish to delete the creation \"" + "\"?");
			
			// Set buttons on dialogue
			ButtonType buttonTypeDelete = new ButtonType("Delete");
			ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);
			deletePopup.getButtonTypes().setAll(buttonTypeDelete, buttonTypeCancel);
			
			Optional<ButtonType> result = deletePopup.showAndWait();
		} catch (NullPointerException e) {
		}
	}
	
	@FXML
	public void handleUpdateClick() {
		
	}
	
	@FXML
	public void handleAddClick() {
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String view = Context.getInstance().currentView();
		
		_listLabel.setText("Recent " + view + ":");
		
		if (view.equals("Leases")) {
			
		} else if (view.equals("Equipment")) {
			
		} else if (view.equals("Customers")) {
			
		} else if (view.equals("Employees")) {
			ObservableList<String> listContent = FXCollections.observableArrayList(_employeeContent);
			_listView.setItems(listContent);
		}
	}
	
	
	
}
