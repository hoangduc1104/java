package aad;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class duc extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					duc frame = new duc();
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
	public duc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label a = new Label("a  =");
		a.setBounds(39, 34, 60, 21);
		contentPane.add(a);
		
		Label b = new Label("b =");
		b.setBounds(39, 83, 60, 21);
		contentPane.add(b);
		
		Label label_2 = new Label("ketqua =");
		label_2.setBounds(39, 153, 60, 21);
		contentPane.add(label_2);
		
		TextField txta = new TextField();
		txta.setBounds(141, 46, 94, 21);
		contentPane.add(txta);
		
		TextField txtb = new TextField();
		txtb.setBounds(141, 83, 94, 21);
		contentPane.add(txtb);
		
		TextField txtkq = new TextField();
		txtkq.setBounds(127, 153, 108, 21);
		contentPane.add(txtkq);
		
		Button button = new Button("cong");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long a = Long.parseLong(txta.getText());
				Long b = Long.parseLong(txtb.getText());
				Long ketqua = a+b;
				JOptionPane.showMessageDialog(null, "Sum = " + ketqua.toString());
				txtkq.setText(ketqua.toString());
			}
		});
		button.setBounds(26, 206, 67, 21);
		contentPane.add(button);
		
		Button button_1 = new Button("tru");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long a = Long.parseLong(txta.getText());
				Long b = Long.parseLong(txtb.getText());
				Long ketqua = a-b;
				JOptionPane.showMessageDialog(null, "hieu = " + ketqua.toString());
				txtkq.setText(ketqua.toString());
			}
		});
		button_1.setBounds(120, 206, 67, 21);
		contentPane.add(button_1);
		
		Button button_2 = new Button("nhan");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long a = Long.parseLong(txta.getText());
				Long b = Long.parseLong(txtb.getText());
				Long ketqua = a*b;
				JOptionPane.showMessageDialog(null, "tich = " + ketqua.toString());
				txtkq.setText(ketqua.toString());
			}
		});
		button_2.setBounds(212, 206, 67, 21);
		contentPane.add(button_2);
		
		Button button_3 = new Button("chia");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Long a = Long.parseLong(txta.getText());
				Long b = Long.parseLong(txtb.getText());
				Long ketqua = a/b;
				JOptionPane.showMessageDialog(null, "thuong = " + ketqua.toString());
				txtkq.setText(ketqua.toString());
			}
		});
		button_3.setBounds(317, 206, 67, 21);
		contentPane.add(button_3);
	}
}
