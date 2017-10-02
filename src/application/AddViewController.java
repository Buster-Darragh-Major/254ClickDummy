package application;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.stage.Stage;

public class AddViewController extends LeaseRightController implements Initializable {

	@FXML
	private Label _addLabel;
	@FXML
	private Button _submitButton;
	@FXML
	private Button _backButton;
	@FXML
	private Label _textFieldLabel1;
	@FXML
	private Label _textFieldLabel2;
	@FXML
	private Label _textFieldLabel3;
	@FXML
	private Label _textFieldLabel4;
	@FXML
	private Label _textFieldLabel5;
	@FXML
	private Label _textFieldLabel6;
	@FXML
	private TextField _textField1;
	@FXML
	private TextField _textField2;
	@FXML
	private TextField _textField3;
	@FXML
	private TextField _textField4;
	@FXML
	private TextField _textField5;
	@FXML
	private TextField _textField6;
	
	@FXML
	public void handleBackClick() {
		Context.getInstance().setUpdate(false);
		Context.getInstance().setUpdate(false);
		Stage stage = (Stage) _backButton.getScene().getWindow(); // Get current stage
		changeWindow("ListView.fxml", stage); // Change to ListView.fxml view
	}
	
	@FXML
	public void handleAddClick() {
		Alert deletePopup = new Alert(AlertType.CONFIRMATION);
		deletePopup.setTitle("Add");
		deletePopup.setHeaderText(null);
		deletePopup.setContentText("Confirm?");
		
		// Set buttons on dialogue
		ButtonType buttonTypeDelete = new ButtonType("Confirm");
		ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);
		deletePopup.getButtonTypes().setAll(buttonTypeCancel, buttonTypeDelete);
		
		Optional<ButtonType> result = deletePopup.showAndWait();
		
		if (result.get() == buttonTypeDelete) {
			Context.getInstance().setUpdate(false);
			Context.getInstance().setUpdate(false);
			Stage stage = (Stage) _submitButton.getScene().getWindow(); // Get current stage
			changeWindow("ListView.fxml", stage); // Change to ListView.fxml view
		}
	}
	
	private void setUpdateValues() {
		_textField1.setText("<<Current Value>>");
		_textField2.setText("<<Current Value>>");
		_textField3.setText("<<Current Value>>");
		_textField4.setText("<<Current Value>>");
		_textField5.setText("<<Current Value>>");
		_textField6.setText("<<Current Value>>");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		String view = Context.getInstance().currentView();
		
		if (view.equals("Leases")) {
			if (Context.getInstance().isUpdate()) {
				_addLabel.setText("Update lease:");
				setUpdateValues();
			} else {
				_addLabel.setText("Add a new lease:");
			}
			
			_textFieldLabel1.setText("Equipment");
			_textFieldLabel2.setText("Customer");
			_textFieldLabel3.setText("Lease Start");
			_textFieldLabel4.setText("Lease Finish");
			_textFieldLabel5.setText("Cost");
			_textFieldLabel6.setText("Conditions");
			
		} else if (view.equals("Equipment")) {
			if (Context.getInstance().isUpdate()) {
				_addLabel.setText("Update employee:");
				setUpdateValues();
			} else {
				_addLabel.setText("Add new equipment:");
			}
			
			_textFieldLabel1.setText("Type");
			_textFieldLabel2.setText("Year");
			_textFieldLabel3.setText("Make");
			_textFieldLabel4.setText("Model");
			_textFieldLabel5.setText("ID");
			_textFieldLabel6.setText("Weight");
			
		} else if (view.equals("Customers")) {
			if (Context.getInstance().isUpdate()) {
				_addLabel.setText("Update employee:");
				setUpdateValues();
			} else {
				_addLabel.setText("Add a new customer:");
			}
			
			_textFieldLabel1.setText("Name");
			_textFieldLabel2.setText("Contact Number");
			_textFieldLabel3.setText("Email");
			_textFieldLabel4.setText("Address");
			_textFieldLabel5.setText("Organization");
			_textFieldLabel6.setText("Credit Card");
			
		} else if (view.equals("Employees")) {
			if (Context.getInstance().isUpdate()) {
				_addLabel.setText("Update employee:");
				setUpdateValues();
			} else {
				_addLabel.setText("Add a new employee:");
			}
			
			_textFieldLabel1.setText("Name");
			_textFieldLabel2.setText("Contact Number");
			_textFieldLabel3.setText("Email");
			_textFieldLabel4.setText("Address");
			_textFieldLabel5.setText("ID");
			_textFieldLabel6.setText("IRD Number");
			
		}
		
	}
	
}
