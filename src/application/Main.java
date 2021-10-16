package application;

import java.io.IOException;
import java.sql.Connection;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sistemahospitalar.sistemahospitalar;

public class Main extends Application {
	
	public static void conectar(String nome, String usuario, String senha){
	 	Connection conn = sistemahospitalar.getConnection(nome, usuario, senha);
	 	if(conn != null) {
	 		JOptionPane.showMessageDialog(null, "Banco de Dados conectado com sucesso!!");
	 	}
		sistemahospitalar.CloseConnection(conn);
	}
	
	@Override
	public void start(Stage stage) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
