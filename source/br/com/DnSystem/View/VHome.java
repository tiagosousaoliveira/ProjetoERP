package br.com.DnSystem.View;

import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JToolBar;

public class VHome extends JFrame{
	JToolBar barra = new JToolBar();
	public VHome() {
		// TODO Auto-generated constructor stub
		super("Tela Inicial");
		this.setLayout(null);
		
		barra.setBounds(0, 0, 800,50);
		
		
		
		add(barra);
		setVisible(true);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null); 		
		
	}

}
