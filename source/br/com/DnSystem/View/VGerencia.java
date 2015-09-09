package br.com.DnSystem.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    
    JButton  	J1cliente	 	 = new JButton();
    JLabel      J1lcliente	 	 = new JLabel ("Cadastro Cliente");
    JButton	 	J1fornecedor	 = new JButton();
    JLabel      J1lfornecedo	 = new JLabel ("Cadastro Fornecedor");
    JButton  	J1fabricante	 = new JButton();
    JButton	 	J1produto	 	 = new JButton();
    JButton  	J1usuario	 	 = new JButton();
    JButton  	J1grupo		 	 = new JButton();
    JButton  	J1tabelaPreço  	 = new JButton();
    JButton  	J1titulos	 	 = new JButton();
    JButton	 	J1banco		 	 = new JButton();

    JButton  	J2cliente	 	 = new JButton();
    JLabel      J2lcliente	 	 = new JLabel ("Cadastro Cliente");
    JButton	 	J2fornecedor	 = new JButton();
    JLabel      J2lfornecedo	 = new JLabel ("Cadastro Fornecedor");
    JButton  	J2fabricante	 = new JButton();
    JButton	 	J2produto	 	 = new JButton();
    JButton  	J2usuario	 	 = new JButton();
    JButton  	J2grupo		 	 = new JButton();
    JButton  	J2tabelaPreço 	 = new JButton();
    JButton  	J2titulos	 	 = new JButton();
    JButton	 	J2banco		 	 = new JButton();

    JButton  	J3cliente	 	 = new JButton();
    JLabel      J3lcliente	 	 = new JLabel ("Cadastro Cliente");
    JButton	 	J3fornecedor	 = new JButton();
    JLabel      J3lfornecedo	 = new JLabel ("Cadastro Fornecedor");
    JButton  	J3fabricante	 = new JButton();
    JButton	 	J3produto	 	 = new JButton();
    JButton  	J3usuario	 	 = new JButton();
    JButton  	J3grupo		 	 = new JButton();
    JButton  	J3tabelaPreço  	 = new JButton();
    JButton  	J3titulos	 	 = new JButton();
    JButton	 	J3banco		 	 = new JButton();

    JButton  	J4cliente	 	 = new JButton();
    JLabel      J4lcliente	 = new JLabel ("Cadastro Cliente");
    JButton	 	J4fornecedor	 = new JButton();
    JLabel      J4lfornecedo	 = new JLabel ("Cadastro Fornecedor");
    JButton  	J4fabricante	 = new JButton();
    JButton	 	J4produto	 	 = new JButton();
    JButton  	J4usuario	 	 = new JButton();
    JButton  	J4grupo			 = new JButton();
    JButton  	J4tabelaPreço  	 = new JButton();
    JButton  	J4titulos	 	 = new JButton();
    JButton	 	J4banco		 	 = new JButton();

    
	public VGerencia() {
		// TODO Auto-generated constructor stub
		super ("Tela de Gerenciamento Cadastral");

	        jtbAba.addTab("Modulo de Vendas", jp1);
	        jp1.setLayout(null);  
	        
			ImageIcon fun = new ImageIcon(getClass().getResource("../img/funci.png"));
			fun.setImage(fun.getImage().getScaledInstance(100, 80,80));
			J1cliente = new JButton(fun);
			J1cliente.setToolTipText("Cadastro de Clientes");
			J1cliente.setBorder(null);
			J1cliente.setBounds(30, 50, 100, 100);
			J1lcliente.setBounds(30, 120, 100, 100);
			J1cliente.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Teste Cliente");
				}
			});
	        
			ImageIcon forn = new ImageIcon(getClass().getResource("../img/funci.png"));
			forn.setImage(forn.getImage().getScaledInstance(50, 35,35));
			J1fornecedor = new JButton(forn);
			J1fornecedor.setToolTipText("Cadastro de Fornecedor");
			J1fornecedor.setBorder(null);
			J1fornecedor.setBounds(180,50, 100, 100);
			J1lfornecedo.setBounds(180,120, 100, 100);
			J1fornecedor.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Teste Fornecedor");
				}
			});

	        
	        jp1.add(J1cliente);
	        jp1.add(J1lcliente);
	        jp1.add(J1fornecedor);
	        jp1.add(J1lfornecedo);
	        
//=============================================================================================================================	        

	        jtbAba.addTab("Modulo de Vendas", jp2);
	        jp2.setLayout(null);  
	        
			ImageIcon fun1 = new ImageIcon(getClass().getResource("../img/funci.png"));
			fun1.setImage(fun1.getImage().getScaledInstance(100, 80,80));
			J2cliente = new JButton(fun1);
			J2cliente.setToolTipText("Cadastro de Clientes");
			J2cliente.setBorder(null);
			J2cliente.setBounds(30, 50, 100, 100);
			J2lcliente.setBounds(30, 120, 100, 100);
			J2cliente.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Teste Cliente");
				}
			});
	        
			ImageIcon forn1 = new ImageIcon(getClass().getResource("../img/funci.png"));
			forn1.setImage(forn1.getImage().getScaledInstance(50, 35,35));
			J2fornecedor = new JButton(forn1);
			J2fornecedor.setToolTipText("Cadastro de Fornecedor");
			J2fornecedor.setBorder(null);
			J2fornecedor.setBounds(180,50, 100, 100);
			J2lfornecedo.setBounds(180,120, 100, 100);
			J2fornecedor.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Teste Fornecedor");
				}
			});

	        
	        jp2.add(J2cliente);
	        jp2.add(J2lcliente);
	        jp2.add(J2fornecedor);
	        jp2.add(J2lfornecedo);
  
//=============================================================================================================================	        

	        jtbAba.addTab("Modulo de Vendas", jp3);
	        jp3.setLayout(null);  
	        
			ImageIcon fun2 = new ImageIcon(getClass().getResource("../img/funci.png"));
			fun2.setImage(fun2.getImage().getScaledInstance(100, 80,80));
			J3cliente = new JButton(fun2);
			J3cliente.setToolTipText("Cadastro de Clientes");
			J3cliente.setBorder(null);
			J3cliente.setBounds(30, 50, 100, 100);
			J3lcliente.setBounds(30, 120, 100, 100);
			J3cliente.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Teste Cliente");
				}
			});
	        
			ImageIcon forn2= new ImageIcon(getClass().getResource("../img/funci.png"));
			forn2.setImage(forn2.getImage().getScaledInstance(50, 35,35));
			J3fornecedor = new JButton(forn2);
			J3fornecedor.setToolTipText("Cadastro de Fornecedor");
			J3fornecedor.setBorder(null);
			J3fornecedor.setBounds(180,50, 100, 100);
			J3lfornecedo.setBounds(180,120, 100, 100);
			J3fornecedor.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Teste Fornecedor");
				}
			});

	        
	        jp3.add(J3cliente);
	        jp3.add(J3lcliente);
	        jp3.add(J3fornecedor);
	        jp3.add(J3lfornecedo);
	        
	        
//=============================================================================================================================	        

	        jtbAba.addTab("Modulo de Vendas", jp4);
	        jp4.setLayout(null);  
	        
			ImageIcon fun1 = new ImageIcon(getClass().getResource("../img/funci.png"));
			fun1.setImage(fun1.getImage().getScaledInstance(100, 80,80));
			J2cliente = new JButton(fun1);
			J2cliente.setToolTipText("Cadastro de Clientes");
			J2cliente.setBorder(null);
			J2cliente.setBounds(30, 50, 100, 100);
			J2lcliente.setBounds(30, 120, 100, 100);
			J2cliente.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Teste Cliente");
				}
			});
	        
			ImageIcon forn1 = new ImageIcon(getClass().getResource("../img/funci.png"));
			forn1.setImage(forn1.getImage().getScaledInstance(50, 35,35));
			J2fornecedor = new JButton(forn1);
			J2fornecedor.setToolTipText("Cadastro de Fornecedor");
			J2fornecedor.setBorder(null);
			J2fornecedor.setBounds(180,50, 100, 100);
			J2lfornecedo.setBounds(180,120, 100, 100);
			J2fornecedor.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Teste Fornecedor");
				}
			});

	        
	        jp4.add(J2cliente);
	        jp4.add(J2lcliente);
	        jp2.add(J2fornecedor);
	        jp2.add(J2lfornecedo);
  
//=============================================================================================================================	        

	        jtbAba.addTab("Modulo de Vendas", jp3);
	        jp3.setLayout(null);  
	        
			ImageIcon fun2 = new ImageIcon(getClass().getResource("../img/funci.png"));
			fun2.setImage(fun2.getImage().getScaledInstance(100, 80,80));
			J3cliente = new JButton(fun2);
			J3cliente.setToolTipText("Cadastro de Clientes");
			J3cliente.setBorder(null);
			J3cliente.setBounds(30, 50, 100, 100);
			J3lcliente.setBounds(30, 120, 100, 100);
			J3cliente.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Teste Cliente");
				}
			});
	        
			ImageIcon forn2= new ImageIcon(getClass().getResource("../img/funci.png"));
			forn2.setImage(forn2.getImage().getScaledInstance(50, 35,35));
			J3fornecedor = new JButton(forn2);
			J3fornecedor.setToolTipText("Cadastro de Fornecedor");
			J3fornecedor.setBorder(null);
			J3fornecedor.setBounds(180,50, 100, 100);
			J3lfornecedo.setBounds(180,120, 100, 100);
			J3fornecedor.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "Teste Fornecedor");
				}
			});

	        
	        jp3.add(J3cliente);
	        jp3.add(J3lcliente);
	        jp3.add(J3fornecedor);
	        jp3.add(J3lfornecedo);
	        
	        
	        add(jtbAba);
		
		setVisible(true);
		setSize(900,700);
		setResizable(false);
		setLocationRelativeTo(null); 		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		
	}

}
