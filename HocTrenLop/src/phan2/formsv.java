package phan2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.List;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formsv extends JFrame {
	TextField txtlop = new TextField();
	TextField txtdtb = new TextField();
	TextField txtht = new TextField();
	TextField txtmasv = new TextField();
	List list = new List();
	TextField txtns = new TextField();

	private lophoc2 lh = new lophoc2();
	public static ArrayList<sinhvien> ds = new ArrayList<sinhvien>();	
	public static lophoc2 l = new lophoc2();
	public static DefaultTableModel dtm = new DefaultTableModel();
	

	private JPanel contentPane;
	private JTable table;


	public void napBang() {
		try {
			ds = l.taolop();
			dtm.addColumn("MaSV");
			dtm.addColumn("HoTen");
			dtm.addColumn("NgaySinh");
			dtm.addColumn("DTB");
			Object[] model=new Object[4];
			for (sinhvien sv : ds) {
				model[0]= sv.getMasv();
				model[1]=sv.getHoten();
				model[2]=sv.getNgaysinh();
				model[3]=sv.getDtb();
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
					formsv frame = new formsv();
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
	
	public formsv() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				FileReader fr;
				napBang();
				try {
					fr = new FileReader("C:\\Users\\PC\\Documents\\sinhvien.txt");
					BufferedReader br = new BufferedReader(fr);
					while(true) {
						String line = br.readLine();
						if(line == null|| line=="")	break;
						String[] tam = line.split(";");
						SimpleDateFormat spd = new SimpleDateFormat("dd/MM/yyyy");
						Date ns = spd.parse(tam[2]);
						sinhvien sv = new sinhvien(tam[0],tam[1],ns,Double.parseDouble(tam[3]),tam[4],tam[5]);
						list.add(tam[1]);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 881, 770);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		list.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String th = list.getSelectedItem();
				try {
					
					for (sinhvien sv :lh.taolop() ) {
						if(sv.getHoten().equals(th)) {
							txtmasv.setText(sv.getMasv());
							txtht.setText(th);
							txtns.setText(sv.getNgaysinh().toString());
							txtlop.setText(sv.getMalop());
							txtdtb.setText(sv.getDtb().toString());
						}
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		list.setBounds(34, 10, 234, 349);
		contentPane.add(list);
		
		Label label = new Label("masv");
		label.setBounds(317, 24, 60, 21);
		contentPane.add(label);
		
		Label label_1 = new Label("ho ten");
		label_1.setBounds(317, 66, 60, 21);
		contentPane.add(label_1);
		
		Label label_2 = new Label("ngay sinh");
		label_2.setBounds(317, 133, 82, 21);
		contentPane.add(label_2);
		
		Label label_3 = new Label("dtb");
		label_3.setBounds(317, 214, 60, 21);
		contentPane.add(label_3);
		
		Label label_4 = new Label("lop");
		label_4.setBounds(317, 286, 60, 21);
		contentPane.add(label_4);
		
		txtmasv.setBounds(430, 24, 167, 21);
		contentPane.add(txtmasv);
		
		txtht.setBounds(429, 66, 234, 21);
		contentPane.add(txtht);
		
		txtns.setBounds(430, 133, 167, 21);
		contentPane.add(txtns);
		
		txtdtb.setBounds(430, 214, 167, 21);
		contentPane.add(txtdtb);
		
		
		txtlop.setBounds(430, 286, 167, 21);
		contentPane.add(txtlop);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(81, 417, 670, 257);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				int d = table.getSelectedRow();//lay dong vua chon
//				String masv = table.getValueAt(d, 0).toString();
//				txtmasv.setText(masv);
//			}
//		});
		tabbedPane.addTab("New tab", null, scrollPane, null);
		
		table = new JTable();
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int d = table.getSelectedRow();//lay dong vua chon
				String masv = table.getValueAt(d, 0).toString();
				txtmasv.setText(masv);
				String ht = table.getValueAt(d, 1).toString();
				txtht.setText(ht);
			}
		});
		scrollPane.setViewportView(table);
		
		Button button = new Button("xoa");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {					
					l.writeFile2("duc");
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(720, 24, 67, 21);
		contentPane.add(button);
		
		Button button_1 = new Button("them");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		button_1.setBounds(720, 84, 67, 21);
		contentPane.add(button_1);
		
		Button button_2 = new Button("tim kiem");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		button_2.setBounds(720, 162, 67, 21);
		contentPane.add(button_2);
		
		Button button_3 = new Button("sua");
		button_3.setBounds(720, 243, 67, 21);
		contentPane.add(button_3);
	}
}
