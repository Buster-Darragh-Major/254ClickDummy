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
			"HP Printer; 327890463; Brown, James; 01/03/2017-02/06/2017",
			"iMac; 462389623; Shannahan, Patrick; 01/03/2017-02/06/2017",
			"Windows Surface; 267490236; Graham, Eliza; 01/03/2017-02/06/2017",
			"Samsumg Laptop; 263923563; Twyman, Bradley; 01/03/2017-02/06/2017",
			"HP Printer; 327890463; Brown, James; 01/03/2017-02/06/2017",
			"iMac; 462389623; Shannahan, Patrick; 01/03/2017-02/06/2017",
			"Windows Surface; 267490236; Graham, Eliza; 01/03/2017-02/06/2017",
			"Samsumg Laptop; 263923563; Twyman, Bradley; 01/03/2017-02/06/2017",
			"HP Printer; 327890463; Brown, James; 01/03/2017-02/06/2017",
			"iMac; 462389623; Shannahan, Patrick; 01/03/2017-02/06/2017",
			"Windows Surface; 267490236; Graham, Eliza; 01/03/2017-02/06/2017",
			"Samsumg Laptop; 263923563; Twyman, Bradley; 01/03/2017-02/06/2017",
			"HP Printer; 327890463; Brown, James; 01/03/2017-02/06/2017",
			"iMac; 462389623; Shannahan, Patrick; 01/03/2017-02/06/2017",
			"Windows Surface; 267490236; Graham, Eliza; 01/03/2017-02/06/2017",
			"Samsumg Laptop; 263923563; Twyman, Bradley; 01/03/2017-02/06/2017"
	));
	ArrayList<String> _equipmentContent = new ArrayList<String>(Arrays.asList(
			"HP Printer; 679202462; 1998",
			"ASUS NoteBook; Ubuntu; 329642104; 2011",
			"iMac; Windows 7; 368926420; 2010",
			"Samsung Printer; 237423241; 1942",
			"HP Printer; 679202462; 1998",
			"ASUS NoteBook; Ubuntu; 329642104; 2011",
			"iMac; Windows 7; 368926420; 2010",
			"Samsung Printer; 237423241; 1942",
			"HP Printer; 679202462; 1998",
			"ASUS NoteBook; Ubuntu; 329642104; 2011",
			"iMac; Windows 7; 368926420; 2010",
			"Samsung Printer; 237423241; 1942",
			"HP Printer; 679202462; 1998",
			"ASUS NoteBook; Ubuntu; 329642104; 2011",
			"iMac; Windows 7; 368926420; 2010",
			"Samsung Printer; 237423241; 1942"
	));
	ArrayList<String> _customerContent = new ArrayList<String>(Arrays.asList(
			"Beagly, Maddie; 021 456 9679; Plastic Surgery Co.; 7689 4563 6786 6786",
			"Townsend, Christopher; 027 123 4567; Civil Engineering Ltd.; 0000 0000 0000 0000",
			"Mclaren, Troy; 021 345 0987; Never Comes To Class Inc.; 9999 9999 9999 9999",
			"Woodall, Alex; 021 678 8765; Cricket; 6666 4678 2784 9706",
			"Beagly, Maddie; 021 456 9679; Plastic Surgery Co.; 7689 4563 6786 6786",
			"Townsend, Christopher; 027 123 4567; Civil Engineering Ltd.; 0000 0000 0000 0000",
			"Mclaren, Troy; 021 345 0987; Never Comes To Class Inc.; 9999 9999 9999 9999",
			"Woodall, Alex; 021 678 8765; Cricket; 6666 4678 2784 9706",
			"Beagly, Maddie; 021 456 9679; Plastic Surgery Co.; 7689 4563 6786 6786",
			"Townsend, Christopher; 027 123 4567; Civil Engineering Ltd.; 0000 0000 0000 0000",
			"Mclaren, Troy; 021 345 0987; Never Comes To Class Inc.; 9999 9999 9999 9999",
			"Woodall, Alex; 021 678 8765; Cricket; 6666 4678 2784 9706",
			"Beagly, Maddie; 021 456 9679; Plastic Surgery Co.; 7689 4563 6786 6786",
			"Townsend, Christopher; 027 123 4567; Civil Engineering Ltd.; 0000 0000 0000 0000",
			"Mclaren, Troy; 021 345 0987; Never Comes To Class Inc.; 9999 9999 9999 9999",
			"Woodall, Alex; 021 678 8765; Cricket; 6666 4678 2784 9706"
			
	));
	ArrayList<String> _employeeContent = new ArrayList<String>(Arrays.asList(
			"Aharon, Ravid; 1234; ravidaharon@gmail.com",
			"Cairns, Nathan; 4567; nathancairns@hotmail.com",
			"Raitava-Kumar, Cyrus; 7890; kumz@emailadress.ac.nz",
			"Huxford, Zach; 8765, zachbwh@lol.co.nz",
			"Aharon, Ravid; 1234; ravidaharon@gmail.com",
			"Cairns, Nathan; 4567; nathancairns@hotmail.com",
			"Raitava-Kumar, Cyrus; 7890; kumz@emailadress.ac.nz",
			"Huxford, Zach; 8765, zachbwh@lol.co.nz",
			"Aharon, Ravid; 1234; ravidaharon@gmail.com",
			"Cairns, Nathan; 4567; nathancairns@hotmail.com",
			"Raitava-Kumar, Cyrus; 7890; kumz@emailadress.ac.nz",
			"Huxford, Zach; 8765, zachbwh@lol.co.nz",
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
			String selection = _listView.getSelectionModel().getSelectedItem();
			if (selection == null) {
				throw new NullPointerException();
			}
			
			Alert deletePopup = new Alert(AlertType.CONFIRMATION);
			deletePopup.setTitle("Delete");
			deletePopup.setHeaderText(null);
			deletePopup.setContentText("Are you sure you wish to delete \"" + selection + "\"?");
			
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
		try {
			String selection = _listView.getSelectionModel().getSelectedItem();
			if (selection == null) {
				throw new NullPointerException();
			}
			
			Context.getInstance().setUpdate(true);
			Stage stage = (Stage) _updateButton.getScene().getWindow(); // Get current stage
			changeWindow("AddView.fxml", stage); // Change to AddView.fxml view
		} catch (NullPointerException e) {
		}
		
		
	}
	
	@FXML
	public void handleAddClick() {
		Stage stage = (Stage) _addButton.getScene().getWindow(); // Get current stage
		changeWindow("AddView.fxml", stage); // Change to AddView.fxml view
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String view = Context.getInstance().currentView();
		
		_listLabel.setText("Recent " + view + ":");
		
		if (view.equals("Leases")) {
			ObservableList<String> listContent = FXCollections.observableArrayList(_leaseContent);
			_listView.setItems(listContent);
		} else if (view.equals("Equipment")) {
			ObservableList<String> listContent = FXCollections.observableArrayList(_equipmentContent);
			_listView.setItems(listContent);
		} else if (view.equals("Customers")) {
			ObservableList<String> listContent = FXCollections.observableArrayList(_customerContent);
			_listView.setItems(listContent);
		} else if (view.equals("Employees")) {
			ObservableList<String> listContent = FXCollections.observableArrayList(_employeeContent);
			_listView.setItems(listContent);
		}
	}
	
	
	
}
