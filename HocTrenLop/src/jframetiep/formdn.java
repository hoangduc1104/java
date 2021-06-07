package jframetiep;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Phan1.menu;
import Phan1.menuu;
import phan2.formsv;
import phan2.lophoc2;
import phan2.sinhvien;

import java.awt.Label;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formdn extends JFrame {
	public static String un="";
	public static String p="";
	private JPanel contentPane;
	private JTextField txtuser;
	private JTextField txtpass;
	private lophoc2 lh = new lophoc2();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formdn frame = new formdn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public formdn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setBounds(74, 42, 49, 14);
		contentPane.add(lblNewLabel);
		
		txtuser = new JTextField();
		txtuser.setBounds(187, 39, 96, 20);
		contentPane.add(txtuser);
		txtuser.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setBounds(74, 103, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		txtpass = new JTextField();
		txtpass.setBounds(187, 100, 96, 20);
		contentPane.add(txtpass);
		txtpass.setColumns(10);
		
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					un = txtuser.getText();
					p=txtpass.getText();
					lh.taolop();
					sinhvien sv = lh.ktdn(un,p);
					if(sv!=null) {
						new formsv().setVisible(true);
						System.out.print(un+";"+txtpass.getText());
					}
					else {
						JOptionPane.showMessageDialog(null, "dang nhap sai");
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
		});
		btnNewButton.setBounds(153, 208, 89, 23);
		contentPane.add(btnNewButton);
	}
}
