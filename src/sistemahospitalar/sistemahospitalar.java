package sistemahospitalar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class sistemahospitalar {
	

	public static Connection getConnection(String nome, String usuario, String senha){
		
		String URL = "jdbc:mysql://localhost:3306/" + nome
	 			+ "?useTimezone=true&serverTimezone=GMT";
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(URL, usuario, senha);
		} catch (ClassNotFoundException | SQLException ex) {
			JOptionPane.showInternalMessageDialog(null,"Erro ao conectar com Banco de Dados "+nome+"");
			throw new RuntimeException("Erro ao conectar com db:" + ex);

		}
	}

	public static void CloseConnection(Connection conn) {
        try {
            if(conn != null) {
                conn.close();
            }
        }
        catch(SQLException ex) {
            Logger.getLogger(sistemahospitalar.class.getName()).log(Level.SEVERE, null, ex);
        }
}
	
}
