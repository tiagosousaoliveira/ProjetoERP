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
	JButton  compras	  = new JButton ();
	JButton  estoque	  = new JButton ();
	JMenu    menu 		  = new JMenu();
	
	
	
	public VHome() {
		// TODO Auto-generated constructor stub
		super("Tela Inicial");
		this.setLayout(null);
		
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();  
        Dimension dw = getSize(); 
        barra.setSize((ds.width - dw.width),50);

		ImageIcon liv = new ImageIcon(getClass().getResource("../img/livros.png"));
		liv.setImage(liv.getImage().getScaledInstance(50, 35,35));
		cadastros = new JButton(liv);
		cadastros.setToolTipText("Menu de Cadastros");
		cadastros.setBorder(null);
		cadastros.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VGerencia vgerencia = new VGerencia();
			}
		});
				
		ImageIcon fin = new ImageIcon(getClass().getResource("../img/dinheiro.png"));
		fin.setImage(fin.getImage().getScaledInstance(50, 35,35));
		Financeiro = new JButton(fin);
		Financeiro.setToolTipText("Modulo Financeiro");
		Financeiro.setBorder(null);
		Financeiro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		ImageIcon com = new ImageIcon(getClass().getResource("../img/compras.png"));
		com.setImage(com.getImage().getScaledInstance(50, 35,35));
		compras = new JButton(com);
		compras.setToolTipText("Modulo Compras");
		compras.setBorder(null);
		compras.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VGerencia vgerencia = new VGerencia();
			}
		});
		
		ImageIcon est = new ImageIcon(getClass().getResource("../img/estoque.png"));
		est.setImage(est.getImage().getScaledInstance(50, 35,35));
		estoque = new JButton(est);
		estoque.setToolTipText("Modulo de Estoque");
		estoque.setBorder(null);
		estoque.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VGerencia vgerencia = new VGerencia();
			}
		});

		barra.add(cadastros);
		barra.add(Financeiro);
		barra.add(compras);
		barra.add(estoque);
		add(barra);
		
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();  
		
		setVisible(true);
		setSize(tela);
		setResizable(false);
		setLocationRelativeTo(null); 		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}

}
