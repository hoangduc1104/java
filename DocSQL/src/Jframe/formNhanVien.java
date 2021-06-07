package Jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.hd.program.program;
import com.hd.ui.DonVi;
import com.hd.ui.NhanVien;

import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;

public class formNhanVien extends JFrame {
	TextField txtgt = new TextField();
	TextField txthsl = new TextField();
	TextField txtns = new TextField();
	TextField txttnv = new TextField();
	TextField txtmnv = new TextField();
	TextField txtp = new TextField();
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
					formNhanVien frame = new formNhanVien();
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
	public formNhanVien() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				napBang(program.listnv);
				for (DonVi dv : program.listdv) {
					choice.add(dv.getMaDV());
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 966, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Ma Nhan Vien");
		label.setBounds(44, 34, 132, 21);
		contentPane.add(label);
		
		Label label_1 = new Label("Ten Nhan Vien");
		label_1.setBounds(44, 87, 113, 21);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Gioi Tinh");
		label_2.setBounds(44, 142, 92, 21);
		contentPane.add(label_2);
		
		Label label_3 = new Label("Ngay Sinh");
		label_3.setBounds(44, 200, 113, 21);
		contentPane.add(label_3);
		
		Label label_4 = new Label("He So Luong");
		label_4.setBounds(44, 256, 113, 21);
		contentPane.add(label_4);
		
		txtmnv.setBounds(182, 34, 92, 21);
		contentPane.add(txtmnv);
		
		txttnv.setBounds(182, 87, 217, 21);
		contentPane.add(txttnv);
		
		
		txtgt.setBounds(182, 142, 60, 21);
		contentPane.add(txtgt);
		
		txtns.setBounds(182, 200, 130, 21);
		contentPane.add(txtns);
		
		txthsl.setBounds(182, 256, 79, 21);
		contentPane.add(txthsl);
		
		Button button = new Button("Search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String key = JOptionPane.showInputDialog("Nhap ma Nhan Vien Can Tim:");
				for (NhanVien nv : program.listnv) {
					if(key.equals(nv.getMaNV())) {
						txtmnv.setText(nv.getMaNV());
						txttnv.setText(nv.getTenNV());
						txtgt.setText(nv.getGioiTinh());
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
						String d = sdf.format(nv.getNgaySinh());
						txtns.setText(d);
						txthsl.setText(nv.getHeSoLuong().toString());
					}
				}
			}
		});
		button.setBounds(520, 44, 67, 21);
		contentPane.add(button);
		
		Button button_1 = new Button("Delete");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					try {
						program.nv.DeleteNhanVien(txtmnv.getText());
						program.listnv = program.nv.docsql();
						napBang(program.listnv);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
			}
		});
		
		button_1.setBounds(738, 44, 67, 21);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Update");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					program.nv.updateNV(txtmnv.getText(),txttnv.getText(),txtgt.getText(),txtns.getText(),Float.parseFloat(txthsl.getText()),choice.getSelectedItem());
					program.listnv = program.nv.docsql();
					napBang(program.listnv);
					System.out.print("Da update");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_2.setBounds(520, 142, 67, 21);
		contentPane.add(button_2);
		
		Button button_3 = new Button("Insert");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					program.nv.insertNhanVien(txtmnv.getText(),txttnv.getText(),txtgt.getText(),txtns.getText(),Float.parseFloat(txthsl.getText()),choice.getSelectedItem(),txtp.getText());
					program.listnv = program.nv.docsql();
					napBang(program.listnv);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_3.setBounds(738, 142, 67, 21);
		contentPane.add(button_3);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(72, 327, 819, 161);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("New tab", null, scrollPane, null);
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int d = table.getSelectedRow();//lay dong vua chon
				String mnv = table.getValueAt(d, 0).toString();
				txtmnv.setText(mnv);
				String tnv = table.getValueAt(d, 1).toString();
				txttnv.setText(tnv);
				String gt = table.getValueAt(d, 2).toString();
				txtgt.setText(gt);
				String ns = table.getValueAt(d, 3).toString();
				txtns.setText(ns);
				String hsl = table.getValueAt(d,4).toString();
				txthsl.setText(hsl);
				
			}
		});
		scrollPane.setViewportView(table);
		
		Label label_5 = new Label("Ma Don Vi");
		label_5.setBounds(420, 256, 100, 21);
		contentPane.add(label_5);
		
		Label label_6 = new Label("Password");
		label_6.setBounds(420, 200, 100, 21);
		contentPane.add(label_6);
		
		
		txtp.setBounds(548, 200, 196, 21);
		contentPane.add(txtp);
		

		choice.setBounds(548, 266, 196, 18);
		contentPane.add(choice);
	}
}
