package Jframe;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.hd.program.program;
import com.hd.ui.NhanVien;

import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formdn extends JFrame {
	TextField txtus = new TextField();
	TextField txtp = new TextField();
	private String un="";
	private String pass="";
	private JPanel contentPane;

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
		setBounds(100, 100, 526, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Username");
		label.setBounds(89, 93, 97, 21);
		contentPane.add(label);
		
		Label label_1 = new Label("Password");
		label_1.setBounds(89, 171, 97, 21);
		contentPane.add(label_1);
		
		
		txtus.setBounds(233, 93, 166, 21);
		contentPane.add(txtus);
		
		
		txtp.setBounds(237, 171, 162, 21);
		contentPane.add(txtp);
		
		Button button = new Button("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					un = txtus.getText();
					pass=txtp.getText();
					boolean isLogin = false;
					for (NhanVien nv : program.listnv) {
						if(un.equals(nv.getMaNV())&&pass.equals(nv.getPass())) {
							new FormNV2().setVisible(true);
							isLogin = true;
						}
					}
					
					if(!isLogin) JOptionPane.showMessageDialog(null, "dang nhap sai");
					}
				catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		button.setBounds(233, 313, 67, 21);
		contentPane.add(button);
	}

}
