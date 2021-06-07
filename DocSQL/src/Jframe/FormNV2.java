package Jframe;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.hd.DAO.NhanVien_txt_DAO;
import com.hd.program.program;
import com.hd.ui.DonVi;
import com.hd.ui.NhanVien;

import java.awt.List;
import java.awt.Label;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Choice;

public class FormNV2 extends JFrame {
	TextField txtHT = new TextField();
	TextField txtMNV = new TextField();
	TextField txtNS = new TextField();
	TextField txtHSL = new TextField();
	TextField txtGT = new TextField();
	TextField txtMK = new TextField();
	List list = new List();
	Choice choice = new Choice();
	private JPanel contentPane;
	private JTable table;
	public void napBang(ArrayList<NhanVien> list) {
		try {
			DefaultTableModel dtm = new DefaultTableModel();
			dtm.addColumn("Ma Nhan Vien");
			dtm.addColumn("Ten Nhan Vien");
			dtm.addColumn("Gioi Tinh");
			dtm.addColumn("Ngay Sinh");
			dtm.addColumn("He So Luong");
			dtm.addColumn("Ma DOn Vi");
			Object[] model=new Object[6];
			for (NhanVien nv : list) {
				model[0]= nv.getMaNV();
				model[1]=nv.getTenNV();
				model[2]=nv.getGioiTinh();
				SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-dd");
				String d = spd.format(nv.getNgaySinh()); 
				model[3]=d;
				model[4]=nv.getHeSoLuong().toString();
				model[5]=nv.getMaDV();
				dtm.addRow(model);
			}
			table.setModel(dtm);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormNV2 frame = new FormNV2();
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
	
	public FormNV2() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				napBang(program.listnv);
				for (DonVi dv : program.listdv) {
					list.add(dv.getMaDV());
					choice.add(dv.getMaDV());
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1091, 647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		list.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String th = list.getSelectedItem();
				ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
				for(NhanVien nv : program.listnv) {
					String t=nv.getMaDV();
					if(t.equals(th)) {
						ds.add(nv);
					}
				}
				napBang(ds);
			}
		});
		list.setBounds(10, 10, 110, 524);
		contentPane.add(list);
		
		Label label = new Label("MaNV");
		label.setBounds(186, 22, 60, 21);
		contentPane.add(label);
		
		Label label_1 = new Label("HoTen");
		label_1.setBounds(186, 82, 60, 21);
		contentPane.add(label_1);
		
		Label label_2 = new Label("NgaySinh");
		label_2.setBounds(186, 138, 76, 21);
		contentPane.add(label_2);
		
		Label label_3 = new Label("GioiTinh");
		label_3.setBounds(186, 194, 76, 21);
		contentPane.add(label_3);
		
		Label label_4 = new Label("HSL");
		label_4.setBounds(186, 255, 60, 21);
		contentPane.add(label_4);
		
		Label label_5 = new Label("MatKhau");
		label_5.setBounds(302, 309, 76, 21);
		contentPane.add(label_5);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(164, 384, 855, 215);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("New tab", null, scrollPane, null);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int d = table.getSelectedRow();//lay dong vua chon
				String mnv = table.getValueAt(d, 0).toString();
				txtMNV.setText(mnv);
				String tnv = table.getValueAt(d, 1).toString();
				txtHT.setText(tnv);
				String gt = table.getValueAt(d, 2).toString();
				txtGT.setText(gt);
				String ns = table.getValueAt(d, 3).toString();
				txtNS.setText(ns);
				String hsl = table.getValueAt(d,4).toString();
				txtHSL.setText(hsl);
				
			}
		});
		scrollPane.setColumnHeaderView(table);
		
		
		txtMNV.setBounds(302, 22, 176, 21);
		contentPane.add(txtMNV);
		
		
		txtHT.setBounds(302, 82, 176, 21);
		contentPane.add(txtHT);
		
	
		txtNS.setBounds(302, 138, 176, 21);
		contentPane.add(txtNS);
		
		
		txtGT.setBounds(302, 194, 176, 21);
		contentPane.add(txtGT);
		
		
		txtHSL.setBounds(302, 255, 176, 21);
		contentPane.add(txtHSL);
		
		
		txtMK.setBounds(484, 309, 176, 21);
		contentPane.add(txtMK);
		
		Button button = new Button("Find");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String key = JOptionPane.showInputDialog("Nhap ma Nhan Vien Can Tim:");
				for (NhanVien nv : program.listnv) {
					if(key.equals(nv.getMaNV())) {
						txtMNV.setText(nv.getMaNV());
						txtHT.setText(nv.getTenNV());
						txtGT.setText(nv.getGioiTinh());
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
						String d = sdf.format(nv.getNgaySinh());
						txtNS.setText(d);
						txtHSL.setText(nv.getHeSoLuong().toString());
					}
				}
			}
		});
		button.setBounds(807, 22, 67, 21);
		contentPane.add(button);
		
		Button button_1 = new Button("Them");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String mdv = choice.getSelectedItem();
					if(mdv==null) {
						JOptionPane.showMessageDialog(null, "Chua Chon ma don vi");
						return;
					}
				
					program.nv.insertNhanVien(txtMNV.getText(),txtHT.getText(),txtGT.getText(),txtNS.getText(),Float.parseFloat(txtHSL.getText()),mdv,txtMK.getText());
					program.listnv = program.nv.docsql();
					napBang(program.listnv);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_1.setBounds(807, 93, 67, 21);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Sua");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					program.nv.updateNV(txtMNV.getText(),txtHT.getText(),txtGT.getText(),txtNS.getText(),Float.parseFloat(txtHSL.getText()),choice.getSelectedItem());
					program.listnv = program.nv.docsql();
					napBang(program.listnv);
					System.out.print("Da update");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_2.setBounds(807, 150, 67, 21);
		contentPane.add(button_2);
		
		Button button_3 = new Button("xoa");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String key = JOptionPane.showInputDialog("Nhap ten Nhan Vien Can xoa:");
					for (NhanVien nv : program.listnv) {
						if(key.equalsIgnoreCase(nv.getTenNV())) {
							txtMNV.setText(key);
							program.nv.DeleteNhanVien(txtMNV.getText());
							program.listnv = program.nv.docsql();
							napBang(program.listnv);
						}
					}
					program.nv.DeleteNhanVien(txtMNV.getText());
					program.listnv = program.nv.docsql();
					napBang(program.listnv);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_3.setBounds(807, 228, 67, 21);
		contentPane.add(button_3);
		
		Button button_4 = new Button("import");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					NhanVien_txt_DAO x = new NhanVien_txt_DAO();
					x.readfile();
					program.listnv = program.nv.docsql();
					napBang(program.listnv);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_4.setBounds(807, 309, 67, 21);
		contentPane.add(button_4);
		
		Label label_6 = new Label("DonVi");
		label_6.setBounds(302, 357, 60, 21);
		contentPane.add(label_6);
		
		
		choice.setBounds(484, 360, 127, 18);
		contentPane.add(choice);
	}
}
