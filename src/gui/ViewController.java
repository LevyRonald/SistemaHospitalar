package gui;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ViewController {
	@FXML
	private Button btTeste;
	
	@FXML
	private TextField nameDB; 
	
	@FXML
	private TextField nameADM; 
	
	@FXML
	private PasswordField senhaDB; 
	
	@FXML
	private Button nov;
	
	public void onBtTestAction() {
		
		String namedb =  nameDB.getText();
		String nameadm = nameADM.getText();
		String senhadb = senhaDB.getText();
		Main.conectar(namedb, nameadm, senhadb);
		
	
	}
	public void novacon(){
		nameDB.setText("");
		nameADM.setText("");
		senhaDB.setText("");
	}
}
