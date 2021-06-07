package Phan1;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Choice;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.List;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class abc extends JFrame {
	Choice choice = new Choice();
	ArrayList<String> ds = new ArrayList<String>();
	private JPanel contentPane;
	private final TextField txtgia = new TextField();
	TextField txtsoluong = new TextField();
	TextField txtthanhtien = new TextField();
	private final List list = new List();
	private final Label label_2 = new Label("thanhtien");
	private final Label label_3 = new Label("soluong");
	private final TextField txtsl = new TextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					abc frame = new abc();
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
	public abc() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				FileReader fr;
				try {
					fr = new FileReader("C:\\Users\\PC\\Documents\\jframe.txt");
					BufferedReader br = new BufferedReader(fr);
					while(true) {
						String line = br.readLine();
						if(line == null|| line=="")	break;
						String[] tam = line.split(";");
						String a = tam[0];
						String b = tam[1];
						String c = tam[2];
						choice.add(tam[1]);
						ds.add(tam[0]+";"+tam[1]+";"+tam[2]);
						
					}
					fr.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		choice.setBounds(169, 28, 137, 18);
		contentPane.add(choice);
		
		Label label = new Label("chonHang");
		label.setBounds(59, 25, 84, 21);
	
		contentPane.add(label);
		choice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				String th = choice.getSelectedItem();//lay ten hang chon tu choice
				for(String h : ds) {
					String[] t=h.split("[;]");
					if(t[1].equals(th)) {
						txtgia.setText(t[2]);
						break;
					}
				}
			}
		});
		
		Label label_1 = new Label("gia");
		label_1.setBounds(59, 76, 60, 21);
		contentPane.add(label_1);

		txtgia.setBounds(169, 76, 151, 21);
		contentPane.add(txtgia);
		
		
		txtthanhtien.setBounds(169, 178, 151, 21);
		contentPane.add(txtthanhtien);
		list.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		list.setBounds(408, 10, 199, 223);
		
		
		contentPane.add(list);
		label_2.setBounds(59, 178, 60, 21);
		
		contentPane.add(label_2);
		label_3.setBounds(59, 120, 60, 21);
		
		contentPane.add(label_3);
		txtsl.setBounds(169, 120, 151, 21);
		
		contentPane.add(txtsl);
		list.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				String th = list.getSelectedItem();//lay ten hang chon tu choice
				for(String h : ds) {
					String[] t=h.split("[;]");
					if(t[1].equals(th)) {
						txtgia.setText(t[2]);
						break;
					}
				}
			}
		});
	}
}
