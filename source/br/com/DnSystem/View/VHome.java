package br.com.DnSystem.View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

public class VHome extends JFrame{
	
	JToolBar barra 		   = new JToolBar();
	JButton  Jcadastros    = new JButton ();
	JButton  JFinanceiro   = new JButton ();
	JButton  Jcompras	   = new JButton ();
	JButton  Jestoque	   = new JButton ();
	JButton  Jvendas	   = new JButton ();
	JMenuBar menu 		   = new JMenuBar();
		
	
	public VHome() {
		// TODO Auto-generated constructor stub
		super("Tela Inicial");
		this.setLayout(null);
		
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();  
        Dimension dw = getSize(); 
        barra.setSize((ds.width - dw.width),50);
        menu.setLocation(0, 60);
        menu.setSize((ds.width - dw.width),20);
        

		ImageIcon liv = new ImageIcon(getClass().getResource("../img/livros.png"));
		liv.setImage(liv.getImage().getScaledInstance(50, 35,35));
		Jcadastros = new JButton(liv);
		Jcadastros.setToolTipText("Menu de Cadastros");
		Jcadastros.setBorder(null);
		Jcadastros.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VGerencia vgerencia = new VGerencia();
			}
		});
				
		ImageIcon fin = new ImageIcon(getClass().getResource("../img/dinheiro.png"));
		fin.setImage(fin.getImage().getScaledInstance(50, 35,35));
		JFinanceiro = new JButton(fin);
		JFinanceiro.setToolTipText("Modulo Financeiro");
		JFinanceiro.setBorder(null);
		JFinanceiro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		ImageIcon com = new ImageIcon(getClass().getResource("../img/compras.png"));
		com.setImage(com.getImage().getScaledInstance(50, 35,35));
		Jcompras = new JButton(com);
		Jcompras.setToolTipText("Modulo Compras");
		Jcompras.setBorder(null);
		Jcompras.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VGerencia vgerencia = new VGerencia();
			}
		});
		
		ImageIcon est = new ImageIcon(getClass().getResource("../img/estoque.png"));
		est.setImage(est.getImage().getScaledInstance(50, 35,35));
		Jestoque = new JButton(est);
		Jestoque.setToolTipText("Modulo de Estoque");
		Jestoque.setBorder(null);
		Jestoque.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VGerencia vgerencia = new VGerencia();
			}
		});
		
		ImageIcon ven = new ImageIcon(getClass().getResource("../img/venda.png"));
		ven.setImage(ven.getImage().getScaledInstance(50, 35,35));
		Jvendas = new JButton(ven);
		Jvendas.setToolTipText("Modulo de Vendas");
		Jvendas.setBorder(null);
		Jvendas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VGerencia vgerencia = new VGerencia();
			}
		});

		ImageIcon venda = new ImageIcon(getClass().getResource("../img/vendas.png"));
		venda.setImage(venda.getImage().getScaledInstance(400, 280,280));
		JLabel vend = new JLabel(venda);
		vend.setSize( 800, 800);
		vend.setLocation(800, 200);

		barra.add(Jcadastros);
		barra.add(JFinanceiro);
		barra.add(Jcompras);
		barra.add(Jestoque);
		barra.add(Jvendas);
		add(vend);
		add(menu);
		add(barra);
		
	
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();  
		
		getContentPane().setBackground(Color.white);
		setVisible(true);
		setSize(tela);
		setResizable(false);
		setLocationRelativeTo(null); 		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}

}
