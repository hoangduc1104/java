package Jframe;

import java.awt.BorderLayout;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Button;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class formDonVi extends JFrame {
	TextField txtmdv = new TextField();
	TextField txttdv = new TextField();
	private JPanel contentPane;
	private JTable table;
	
	
	public void napBang(ArrayList<DonVi> list) {
		try {
			DefaultTableModel dtm = new DefaultTableModel();
			dtm.addColumn("Ma Don Vi");
			dtm.addColumn("Ten Don Vi");
			Object[] model=new Object[2];
			for (DonVi dv : list) {
				model[0]= dv.getMaDV();
				model[1]=dv.getTenDV();
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
					formDonVi frame = new formDonVi();
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
	public formDonVi() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				napBang(program.listdv);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Ma Don Vi");
		label.setBounds(30, 31, 98, 21);
		contentPane.add(label);
		
		
		txtmdv.setBounds(176, 31, 197, 21);
		contentPane.add(txtmdv);
		
		Label label_1 = new Label("Ten Don Vi");
		label_1.setBounds(30, 105, 110, 21);
		contentPane.add(label_1);
		
		
		txttdv.setBounds(176, 105, 233, 21);
		contentPane.add(txttdv);
		
		Button button = new Button("Search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String key = JOptionPane.showInputDialog("Nhap ma don vi can Tim:");
				for (DonVi dv : program.listdv) {
					if(key.equals(dv.getMaDV())) {
						txtmdv.setText(dv.getMaDV());
						txttdv.setText(dv.getTenDV());
				
					}
				}
			}
		});
		button.setBounds(528, 31, 85, 21);
		contentPane.add(button);
		
		Button button_1 = new Button("Insert");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					program.dv.insertDonVi(txtmdv.getText(),txttdv.getText());
					program.listdv = program.dv.docsql();
					napBang(program.listdv);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_1.setBounds(748, 31, 67, 21);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Delete");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					program.dv.DeleteDV(txtmdv.getText());
					program.listdv = program.dv.docsql();
					napBang(program.listdv);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_2.setBounds(528, 105, 67, 21);
		contentPane.add(button_2);
		
		Button button_3 = new Button("Update");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					program.dv.updateDonVi(txtmdv.getText(),txttdv.getText());
					program.listdv = program.dv.docsql();
					napBang(program.listdv);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_3.setBounds(748, 105, 67, 21);
		contentPane.add(button_3);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(55, 259, 859, 205);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("New tab", null, scrollPane, null);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int d = table.getSelectedRow();//lay dong vua chon
				String mdv = table.getValueAt(d, 0).toString();
				txtmdv.setText(mdv);
				String tdv = table.getValueAt(d, 1).toString();
				txttdv.setText(tdv);
			}
		});
		scrollPane.setViewportView(table);
	}
}
