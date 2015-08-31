package br.com.DnSystem.Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import br.com.DnSystem.Conexao.Conexao;
import br.com.DnSystem.Model.MLogon;


public class CLogon{
		Connection con = null;
		
		public  CLogon(MLogon logon){
		// TODO Auto-generated constructor stub
		
		if(logon.getNome().equals("") && logon.getSenha().equals("")){
			JOptionPane.showMessageDialog(null, "Digite seu Usuario e Senha");
		}else if (logon.getNome().equals("") ){
			JOptionPane.showMessageDialog(null, "Digite seu Usuario");
		}else if (logon.getSenha().equals("")){
			JOptionPane.showMessageDialog(null, "Digite sua Senha");
		}else {
			
			try {

				ResultSet  res;
				
				JOptionPane.showMessageDialog(null, "Try.");
				
				Conexao conex = new Conexao();
				conex.ConexaoMyql();
				
				JOptionPane.showMessageDialog(null, "Passou a conexao");

				String sql= "select *from usuario where logon = ?";
				
				JOptionPane.showMessageDialog(null, "Passou do select ");
				
				PreparedStatement stm = con.prepareStatement(sql);
				
			//	conex.res = conex.stm.executeQuery(sql);
				
				JOptionPane.showMessageDialog(null, "Passou do Statment");
				
				stm.setString(1,logon.getNome());

				JOptionPane.showMessageDialog(null, "Executou a String");
				
				
				
				if(conex.res.next()){
					
				}else{
					
					
				}
				
				
			}catch(SQLException ex){
				JOptionPane.showMessageDialog(null,ex);
				
			}
		}

	}

	public CLogon(String nome, String senha) {
		// TODO Auto-generated constructor stub
	}

}
