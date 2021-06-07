package com.hd.DAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;

import com.hd.ui.NhanVien;

public class NhanVienDAO {
	public ArrayList<NhanVien> docsql() throws SQLException{
		ArrayList<NhanVien> arr = new ArrayList<NhanVien>();
//		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=lopQuanLyNhanVien;user=DUC;password=123");
		Statement st = coso.conn.createStatement();
		ResultSet r = st.executeQuery("SELECT * FROM NhanVien");
		
		while(r.next()) {
			String mnv = r.getString(1);
			String tnv = r.getString(2);
			String gt = r.getString(3);
			Date ns = r.getDate(4);
			Float hsl = r.getFloat(5);
			String mdv = r.getString(6);
			String p = r.getString(7);
			NhanVien nv = new NhanVien(mnv,tnv,gt,ns,hsl,mdv,p);
			arr.add(nv);
		}
		return arr;
	}
	public void insertNhanVien(String ma,String ten,String gt,String ns, Float hsl, String mdv,String p ) throws SQLException {
		ArrayList<NhanVien> ar = new ArrayList<NhanVien>();
//		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=lopQuanLyNhanVien;user=DUC;password=123");
		PreparedStatement pr = coso.conn.prepareStatement("INSERT INTO NhanVien([MaNhanVien],[TenNhanVien],[GioiTinh],[NgaySinh],[HeSoLuong],[MaDonVi],[PassWord])"+ "VALUES(?,?,?,?,?,?,?)");
		pr.setString(1, ma);
		pr.setString(2, ten);
		pr.setString(3,gt );
		pr.setString(4, ns);
		pr.setFloat(5, hsl);
		pr.setString(6, mdv);
		pr.setString(7, p);
		pr.executeUpdate();
		pr.close();
	}
	public void updateNV(String ma,String ten,String gt,String ns, Float hsl,String madv) throws SQLException {
		ArrayList<NhanVien> ar = new ArrayList<NhanVien>();
//		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=lopQuanLyNhanVien;user=DUC;password=123");
		PreparedStatement pr = coso.conn.prepareStatement("UPDATE NhanVien set [TenNhanVien]=?,[GioiTinh]=?,[NgaySinh]=?,[HeSoLuong]=?,[MaDonVi]=? where [MaNhanVien]=?");
		pr.setString(1, ten);
		pr.setString(2, gt);
		pr.setString(3, ns);
		pr.setFloat(4, hsl);
		pr.setString(5, madv);
		pr.setString(6, ma);
		pr.executeUpdate();
		pr.close();
	}
	public void DeleteNhanVien(String MaNV) throws SQLException
	{
//		Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=lopQuanLyNhanVien;user=DUC;password=123");
		PreparedStatement ps=coso.conn.prepareStatement("DELETE FROM NhanVien"
													+ "      WHERE [TenNhanVien]=?");
		ps.setString(1, MaNV);
		ps.executeUpdate();
		ps.close();
	}
}
