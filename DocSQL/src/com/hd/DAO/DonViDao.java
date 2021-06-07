package com.hd.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.hd.ui.DonVi;

public class DonViDao {
	public ArrayList<DonVi> docsql() throws SQLException{
		ArrayList<DonVi> arr = new ArrayList<DonVi>();
		Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=lopQuanLyNhanVien;user=DUC;password=123");
		Statement st = cn.createStatement();
		ResultSet r = st.executeQuery("SELECT * FROM DonVi");
		
		while(r.next()) {
			String mdv = r.getString(1);
			String tdv = r.getString(2);
			DonVi dv = new DonVi(mdv,tdv);
			arr.add(dv);
		}
		return arr;	
	}
	public void insertDonVi(String ma,String ten) throws SQLException {
		ArrayList<DonVi> ar = new ArrayList<DonVi>();
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=lopQuanLyNhanVien;user=DUC;password=123");
		PreparedStatement pr = conn.prepareStatement("INSERT INTO DonVi([MaDonVi],[TenDonVi])"+ "VALUES(?,?)");
		pr.setString(1, ma);
		pr.setString(2, ten);
		pr.executeUpdate();
		pr.close();
	}
	public void updateDonVi(String ma,String ten ) throws SQLException {
		ArrayList<DonVi> ar = new ArrayList<DonVi>();
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=LopQuanLyNhanVien;user=DUC;password=123");
		PreparedStatement pr = conn.prepareStatement("UPDATE DonVi  SET [TenDonVi]=? where [MaDonVi]=? " );
		pr.setString(1, ten);
		pr.setString(2, ma);
		pr.executeUpdate();
		pr.close();	
	}
	public void DeleteDV(String MaDV) throws SQLException
	{
		Connection cnt=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=LopQuanLyNhanVien;user=DUC;password=123");
		PreparedStatement ps=cnt.prepareStatement("DELETE FROM DonVi"
													+ "      WHERE [MaDonVi]=?");
		ps.setString(1, MaDV);
		ps.executeUpdate();
		ps.close();
	}
}
