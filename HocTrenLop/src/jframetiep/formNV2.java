package jframetiep;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.hd.ui.NhanVien;

import java.awt.List;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Label;
import java.awt.TextField;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.Button;

public class formNV2 extends JFrame {
	TextField txtMK = new TextField();
	TextField txtHSL = new TextField();
	TextField txtGT = new TextField();
	TextField txtNS = new TextField();
	TextField txtHT = new TextField();
	TextField txtMaNV = new TextField();
	TextField txtMDV = new TextField();
	List list = new List();
	
	private JPanel contentPane;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formNV2 frame = new formNV2();
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
	public formNV2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1142, 669);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		list.setBounds(10, 21, 110, 601);
		contentPane.add(list);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(152, 362, 969, 259);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("Danh Sach Sinh Vien", null, scrollPane, null);
		
		table = new JTable();
		scrollPane.setRowHeaderView(table);
		
		Label label = new Label("MaNV");
		label.setBounds(166, 21, 60, 21);
		contentPane.add(label);
		
		Label label_1 = new Label("HoTen");
		label_1.setBounds(166, 73, 60, 21);
		contentPane.add(label_1);
		
		Label label_2 = new Label("NgaySinh");
		label_2.setBounds(166, 133, 75, 21);
		contentPane.add(label_2);
		
		Label label_3 = new Label("GioiTinh");
		label_3.setBounds(166, 191, 75, 21);
		contentPane.add(label_3);
		
		Label label_4 = new Label("HSL");
		label_4.setBounds(166, 253, 60, 21);
		contentPane.add(label_4);
		
		Label label_5 = new Label("MatKhau");
		label_5.setBounds(166, 312, 75, 21);
		contentPane.add(label_5);
		
		
		txtMaNV.setBounds(273, 21, 454, 21);
		contentPane.add(txtMaNV);
		
		
		txtHT.setBounds(273, 73, 454, 21);
		contentPane.add(txtHT);
		
		
		txtNS.setBounds(273, 133, 454, 21);
		contentPane.add(txtNS);
		
		
		txtGT.setBounds(273, 191, 454, 21);
		contentPane.add(txtGT);
		
		
		txtHSL.setBounds(273, 253, 454, 21);
		contentPane.add(txtHSL);
		
		
		txtMK.setBounds(273, 312, 197, 21);
		contentPane.add(txtMK);
		
		Label label_6 = new Label("MaDV");
		label_6.setBounds(494, 312, 60, 21);
		contentPane.add(label_6);
		
		
		txtMDV.setBounds(560, 312, 167, 21);
		contentPane.add(txtMDV);
		
		Button button = new Button("ADD");
		button.setBounds(891, 21, 67, 21);
		contentPane.add(button);
		
		Button button_1 = new Button("DELETE");
		button_1.setBounds(891, 90, 67, 21);
		contentPane.add(button_1);
		
		Button button_2 = new Button("UPDATE");
		button_2.setBounds(891, 164, 67, 21);
		contentPane.add(button_2);
		
		Button button_3 = new Button("SEARCH");
		button_3.setBounds(891, 253, 67, 21);
		contentPane.add(button_3);
		
		Button button_4 = new Button("IMPORT");
		button_4.setBounds(891, 324, 67, 21);
		contentPane.add(button_4);
	}
}
