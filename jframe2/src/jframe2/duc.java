package jframe2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Choice;
import java.awt.TextField;
import java.awt.List;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class duc extends JFrame {
	List list = new List();
	Choice choice = new Choice();
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
		
		TextField txt1 = new TextField();
		txt1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar()==10) {
					choice.add(txt1.getText());
					list.add(txt1.getText());
					txt1.setText("");
				}
			}
		});
		txt1.setBounds(91, 23, 156, 21);
		contentPane.add(txt1);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt1.setText(list.getSelectedItem());
			}
		});
		
		list.setBounds(85, 115, 156, 138);
		contentPane.add(list);
		choice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				txt1.setText(choice.getSelectedItem());
			}
		});
		
		choice.setBounds(91, 64, 200, 18);
		contentPane.add(choice);
	}
}
