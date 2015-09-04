package br.com.DnSystem.View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class VGerencia extends JFrame{
	
	JTabbedPane jtbAba   	 = new JTabbedPane();
	
    JPanel 	 	jp1 		 = new JPanel ();
    JPanel 	 	jp2 		 = new JPanel ();
    JPanel 	 	jp3 		 = new JPanel ();
    JPanel 	 	jp4 		 = new JPanel ();
    JPanel 	 	jp5 		 = new JPanel ();
    
    JButton  	cliente	 	 = new JButton();
    JButton	 	fornecedor	 = new JButton();
    JButton  	fabricante	 = new JButton();
    JButton	 	produto	 	 = new JButton();
    JButton  	usuario	 	 = new JButton();
    JButton  	grupo		 = new JButton();
    JButton  	tabelaPreço  = new JButton();
    JButton  	titulos	 	 = new JButton();
    JButton	 	banco		 = new JButton();

    
	public VGerencia() {
		// TODO Auto-generated constructor stub
		super ("Tela de Gerenciamento Cadastral");
			        
	        jtbAba.addTab("Modulo de Vendas", jp1);
	        jp1.setLayout(null);
	        jtbAba.addTab("Modulo de Compras", jp2);
	        jp2.setLayout(null);
	        jtbAba.addTab("Modulo Financeiro", jp3);
	        jp3.setLayout(null);
	        jtbAba.addTab("Modulo de Dados Gerenciais", jp4);
	        jp4.setLayout(null);
	        jtbAba.addTab("Modulo de Estoque", jp5);
	        jp5.setLayout(null);
	        
	 	        
			ImageIcon fun = new ImageIcon(getClass().getResource("../img/funci.png"));
			fun.setImage(fun.getImage().getScaledInstance(50, 35,35));
			cliente = new JButton(fun);
			cliente.setToolTipText("Cadastro de Clientes");
			cliente.setBorder(null);
			cliente.setBounds(200, 200, 50, 50);
			cliente.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Teste Cliente");
				}
			});
	        
			ImageIcon forn = new ImageIcon(getClass().getResource("../img/funci.png"));
			forn.setImage(forn.getImage().getScaledInstance(50, 35,35));
			
			fornecedor = new JButton(forn);
			fornecedor.setToolTipText("Cadastro de Fornecedor");
			fornecedor.setBorder(null);
			fornecedor.setBounds(200, 200, 50, 50);
			
			fornecedor.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Teste Fornecedor");
				}
			});
	        
			ImageIcon fab = new ImageIcon(getClass().getResource("../img/funci.png"));
			fab.setImage(fab.getImage().getScaledInstance(50, 35,35));
			
			fabricante = new JButton(fab);
			fabricante.setToolTipText("Cadastro de Fabricante");
			fabricante.setBorder(null);
			fabricante.setBounds(200, 200, 50, 50);
			
			cliente.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Teste Cliente");
				}
			});
	        
			ImageIcon pro = new ImageIcon(getClass().getResource("../img/funci.png"));
			pro.setImage(pro.getImage().getScaledInstance(50, 35,35));
			
			cliente = new JButton(pro);
			cliente.setToolTipText("Cadastro de Clientes");
			cliente.setBorder(null);
			cliente.setBounds(200, 200, 50, 50);
			
			cliente.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Teste Cliente");
				}
			});
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        jp1.add(cliente);
	        
	        
//	        jp1.add(fornecedor);
//          jp1.add(fabricante);
	  //      jp1.add(produto);
	    //    jp1.add(grupo);
	      //  jp1.add(tabelaPreço);
	      //  jp1.add(usuario);
	        
	 //       jp3.add(cliente);
	        jp3.add(titulos);
	        jp3.add(banco);
	        
	        
	        
	        
	        
	        add(jtbAba);
		
		setVisible(true);
		setSize(900,900);
		setResizable(false);
		setLocationRelativeTo(null); 		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		
	}

}
