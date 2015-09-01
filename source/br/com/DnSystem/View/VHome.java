package br.com.DnSystem.View;

import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class VHome extends JFrame{
	
	JToolBar barra 		  = new JToolBar();
	JButton  cadastros    = new JButton ();
	JButton  Financeiro   = new JButton ();
	JLabel	 lcadastros;  
	JLabel	 lfinanceiro;
	
	public VHome() {
		// TODO Auto-generated constructor stub
		super("Tela Inicial");
		this.setLayout(null);
		
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();  
        Dimension dw = getSize(); 
        
        barra.setSize((ds.width - dw.width),50);

		ImageIcon log = new ImageIcon(getClass().getResource("../img/livros.png"));
		log.setImage(log.getImage().getScaledInstance(50, 35,35));
		cadastros = new JButton(log);
		cadastros.setToolTipText("Menu de Cadastros");
		
		ImageIcon sen = new ImageIcon(getClass().getResource("../img/dinheiro.png"));
		sen.setImage(sen.getImage().getScaledInstance(50, 35,35));
		Financeiro = new JButton(sen);
		Financeiro.setToolTipText("Modulo Financeiro");
		

		barra.add(cadastros);
		barra.add(Financeiro);
		add(barra);
		
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();  
		
		setVisible(true);
		setSize(tela);
		setResizable(false);
		setLocationRelativeTo(null); 		
		
	}

}
