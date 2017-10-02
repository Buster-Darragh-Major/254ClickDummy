package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SearchViewController extends LeaseRightController implements Initializable {

	@FXML
	private Label _label;
	@FXML
	private Button _searchButton;
	@FXML
	private Button _cancelButton;
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
	private Label _labelStartDate;
	@FXML
	private Label _labelFinishDate;
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
	private TextField _textFieldStartDate;
	@FXML
	private TextField _textFieldFinishDate;
	
	@FXML
	private void handleSearchClick() {
		Stage stage = (Stage) _searchButton.getScene().getWindow();
		stage.close();
	}
	
	@FXML
	private void handleCancelClick() {
		Stage stage = (Stage) _cancelButton.getScene().getWindow();
		stage.close();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String view = Context.getInstance().currentView();
		
		_labelStartDate.setVisible(false);
		_labelFinishDate.setVisible(false);
		_textFieldStartDate.setVisible(false);
		_textFieldFinishDate.setVisible(false);
		
		if (view.equals("Leases")) {
			
			_label.setText("Search Leases:");
			
			_labelStartDate.setVisible(true);
			_labelFinishDate.setVisible(true);
			_textFieldStartDate.setVisible(true);
			_textFieldFinishDate.setVisible(true);
			
			_textFieldLabel1.setText("Equipment");
			_textFieldLabel2.setText("Customer");
			_textFieldLabel3.setText("Lease Start");
			_textFieldLabel4.setText("Lease Finish");
			_textFieldLabel5.setText("Cost");
			_textFieldLabel6.setText("Conditions");
			
		} else if (view.equals("Equipment")) {
			
			_label.setText("Search Equipment:");
			
			_textFieldLabel1.setText("Type");
			_textFieldLabel2.setText("Year");
			_textFieldLabel3.setText("Make");
			_textFieldLabel4.setText("Model");
			_textFieldLabel5.setText("ID");
			_textFieldLabel6.setText("Weight");
			
		} else if (view.equals("Customers")) {

			_label.setText("Search Customers:");
			
			_textFieldLabel1.setText("Name");
			_textFieldLabel2.setText("Contact Number");
			_textFieldLabel3.setText("Email");
			_textFieldLabel4.setText("Address");
			_textFieldLabel5.setText("Organization");
			_textFieldLabel6.setText("Credit Card");
			
		} else if (view.equals("Employees")) {
			
			_label.setText("Search Employees:");
			
			_textFieldLabel1.setText("Name");
			_textFieldLabel2.setText("Contact Number");
			_textFieldLabel3.setText("Email");
			_textFieldLabel4.setText("Address");
			_textFieldLabel5.setText("ID");
			_textFieldLabel6.setText("IRD Number");
			
		}
	}
}
