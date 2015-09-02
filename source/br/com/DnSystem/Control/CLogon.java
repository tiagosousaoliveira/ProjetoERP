package br.com.DnSystem.Control;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.DnSystem.Conexao.Conexao;
import br.com.DnSystem.Model.MLogon;
import br.com.DnSystem.View.VHome;

public class CLogon{
		public int retorno; 
		
		public CLogon(MLogon logon){
		// TODO Auto-generated constructor stub
		if(logon.getNome().equals("") && logon.getSenha().equals("")){
			JOptionPane.showMessageDialog(null, "Digite seu Usuario e Senha");
		}else if (logon.getNome().equals("") ){
			JOptionPane.showMessageDialog(null, "Digite seu Usuario");
		}else if (logon.getSenha().equals("")){
			JOptionPane.showMessageDialog(null, "Digite sua Senha");
		}else {
			try {
				Conexao conex = new Conexao();
				conex.ConexaoMyql();

				String sql= "select *from usuario where logon =? and senha =? ";
				java.sql.PreparedStatement stm = conex.con.prepareStatement(sql);    
				stm.setString(1, logon.getNome());  
				stm.setString(2, logon.getSenha()); 
				ResultSet res = stm.executeQuery();   

				if(res.next()){
					JOptionPane.showMessageDialog(null, "Bem Vindo  "+""+ res.getString("nome_usuario"));
					VHome vhome = new VHome();
					int i=0;
					retorn(i);
				}else{
					JOptionPane.showMessageDialog(null, "Usuario ou Senha Inv�lido");
					int i=1;
					retorn(i);
				}
			}catch(SQLException ex){
				JOptionPane.showMessageDialog(null,ex);
			}
		}		
	}
	public int retorn(int i) {
		// TODO Auto-generated constructor stub
		if(i == 0){
			retorno=1;
		}else if(i==1){
			retorno =0;
		}else{
			JOptionPane.showMessageDialog(null, "Fun��o retorn(); / Sem retorno");
		}
		return retorno;
	}

}
