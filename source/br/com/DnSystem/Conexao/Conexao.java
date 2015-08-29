package br.com.DnSystem.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


public class Conexao{
	Connection con;
	ResultSet  res;
	Statement  stm;
	
	String usuario="sa";
	String senha ="vls021130";
	String Driver="jdbc:sqlserver://localhost:1433;"+"databaseName=DMD";
	

	public void Conexao() {
		try {
					 
			con = DriverManager.getConnection(Driver,usuario,senha);
			JOptionPane.showMessageDialog(null, "Conexão efetada com sucesso");
		}
		catch (SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			
		}
		
	}


}
