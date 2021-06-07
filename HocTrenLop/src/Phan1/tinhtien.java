package Phan1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Choice;
import java.awt.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class tinhtien extends JFrame {
	Choice choice = new Choice();
	List list = new List();
	TextField txtgia = new TextField();
	TextField txttt = new TextField();
	TextField txtsl = new TextField();
	ArrayList<String> ds = new ArrayList<String>();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tinhtien frame = new tinhtien();
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
	public tinhtien() {
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
						list.add(tam[1]);
						ds.add(tam[0]+";"+tam[1]+";"+tam[2]);
						
					}
					fr.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 705, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Label label = new Label("chonhang");
		label.setBounds(37, 10, 99, 21);
		contentPane.add(label);
		
		choice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String th = choice.getSelectedItem();
				for(String h : ds) {
					String[] t=h.split("[;]");
					if(t[1].equals(th)) {
						txtgia.setText(t[2]);
						break;
					}
				}
			}
		});
		
		
		choice.setBounds(142, 13, 176, 18);
		contentPane.add(choice);
		
		Label label_1 = new Label("gia");
		label_1.setBounds(43, 48, 60, 21);
		contentPane.add(label_1);
		
		
		txtgia.setBounds(142, 48, 117, 21);
		contentPane.add(txtgia);
		
		Label label_2 = new Label("soluong");
		label_2.setBounds(43, 94, 60, 21);
		contentPane.add(label_2);
		
		txtsl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				try {
					 BufferedWriter ghi = new BufferedWriter(new FileWriter(new File("tinhtien.txt")));
					if(e.getKeyCode()==10) {
						Long gia = Long.parseLong(txtgia.getText());
						Long sl = Long.parseLong(txtsl.getText());
						Long thanhtien = gia*sl;
						txttt.setText(thanhtien.toString());
						txtsl.setText("");
						txtgia.setText("");
						String luu = choice.getSelectedItem();
						ghi.write(luu);
						
					}
					ghi.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		txtsl.setBounds(143, 94, 116, 21);
		contentPane.add(txtsl);
		
		Label label_3 = new Label("thanhtien");
		label_3.setBounds(43, 143, 60, 21);
		contentPane.add(label_3);
		
		txttt.setBounds(142, 143, 117, 21);
		contentPane.add(txttt);
		list.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String th = list.getSelectedItem();
				for(String h : ds) {
					String[] t=h.split("[;]");
					if(t[1].equals(th)) {
						txtgia.setText(t[2]);
						break;
					}
				}
			}
		});
		
		
		list.setBounds(399, 13, 201, 269);
		contentPane.add(list);
		
		Label label_4 = new Label("doctien");
		label_4.setBounds(43, 247, 60, 21);
		contentPane.add(label_4);
		
		TextField txtdoctien = new TextField();
		txtdoctien.setBounds(136, 247, 187, 98);
		contentPane.add(txtdoctien);
		
		
	}
}
