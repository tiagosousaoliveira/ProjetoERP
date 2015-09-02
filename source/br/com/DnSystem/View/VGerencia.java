package br.com.DnSystem.View;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

public class VGerencia extends JFrame{
	
//	JToolBar 		barra 		  = new JToolBar();
	JTabbedPane	 	Aba			  = new JTabbedPane();
	JPanel			panel 		  = new JPanel();
	public VGerencia() {
		// TODO Auto-generated constructor stub
		super ("Tela de Gerenciamento Cadastral");
		this.setLayout(null);
		
    //    Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();  
    //    Dimension dw = getSize(); 
    //    barra.setSize((ds.width - dw.width),50);
		
		
		
		
		Aba.add("Geral", panel);
		
		add(Aba);
	//	add(barra);
		
		
		setVisible(true);
		setSize(900,900);
		setResizable(false);
		setLocationRelativeTo(null); 		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		
	}

}
