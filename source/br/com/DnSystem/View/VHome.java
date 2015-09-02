package br.com.DnSystem.View;

import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

public class VHome extends JFrame{
	
	JToolBar barra 		  = new JToolBar();
	JButton  cadastros    = new JButton ();
	JButton  Financeiro   = new JButton ();
	JLabel	 lcadastros;  
	JLabel	 lfinanceiro;
	
	JMenu    menu = new JMenu();
	
	
	
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
		cadastros.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
							
				VGerencia vgerencia = new VGerencia();
			}
		});
		
		
		
		
		ImageIcon sen = new ImageIcon(getClass().getResource("../img/dinheiro.png"));
		sen.setImage(sen.getImage().getScaledInstance(50, 35,35));
		Financeiro = new JButton(sen);
		Financeiro.setToolTipText("Modulo Financeiro");
		Financeiro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		

		barra.add(cadastros);
		barra.add(Financeiro);
		add(barra);
		
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();  
		
		setVisible(true);
		setSize(tela);
		setResizable(false);
		setLocationRelativeTo(null); 		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}

}
