package br.com.DnSystem.View;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class VLogon extends JFrame {
	
	JTextField 	   				jlogon = new JTextField();
	JPasswordField 				jsenha = new JPasswordField();
	JButton						blogon = new JButton("Logar");	
	JLabel						lusuar;
	JLabel						lsenha;
	
	
	public VLogon() {
		// TODO Auto-generated constructor stub
		super("Tela de Login");
		
		this.getContentPane();
		this.setLayout(null);
		
		jlogon.setBounds(100, 70, 180, 22);
		jsenha.setBounds(100, 100, 180, 22);
		blogon.setBounds(310, 140, 65, 22);
		blogon.setFont(new Font("Arial", Font.PLAIN, 9));
		
		ImageIcon log = new ImageIcon(getClass().getResource("../img/logon.png"));
		log.setImage(log.getImage().getScaledInstance(20, 20,20));
		lusuar = new JLabel(log);
		lusuar.setBounds(70, 65, 30, 30);
		
		ImageIcon sen = new ImageIcon(getClass().getResource("../img/lock.png"));
		sen.setImage(sen.getImage().getScaledInstance(20, 20,20));
		lsenha = new JLabel(sen);
		lsenha.setBounds(70, 95, 30, 30);
		
		blogon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				verifica(jlogon, jsenha);
				
				
			}
		});
		

		add(jlogon);
		add(jsenha);
		add(blogon);
		add(lusuar);
		add(lsenha);
		
		setVisible(true);
		setResizable(false);
		setSize(400,200);
		setLocationRelativeTo(null);  
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VLogon();
	}
	
	public void verifica(JTextField nom, JPasswordField sen){
		
		nom.equals(jlogon.getText());
		sen.equals(jsenha.getText());
		
		JOptionPane.showMessageDialog(null, "Nome utilizaso" +nom);
		JOptionPane.showMessageDialog(null, "Senha utilizada" +sen);
		
	}

}
