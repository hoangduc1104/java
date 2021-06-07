package com.hd.DAO;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.hd.ui.loai;
import com.hd.ui.sanPham;


import java.sql.Connection;

public class sanphamDAO {
	public ArrayList<sanPham> docsql() throws SQLException{
		ArrayList<sanPham> ar = new ArrayList<sanPham>();
		Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=sanPham;user=DUC;password=123");
		Statement st = cn.createStatement();
		ResultSet r = st.executeQuery("SELECT *	FROM SanPham");
		
		while(r.next()) {
			int masp = r.getInt(1);
			String tensp = r.getString(2);
			int gia = r.getInt(3);
			sanPham sp = new sanPham(masp,tensp,gia);
			ar.add(sp);
		}
		return ar;	
	}
	public void insertSanPham(String tenSP,int gia,int maloai) throws SQLException {
		ArrayList<loai> ar = new ArrayList<loai>();
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=sanPham;user=DUC;password=123");
		PreparedStatement pr = conn.prepareStatement("INSERT INTO SanPham([TenSP],[Gia],[Maloai])"+ "VALUES(?,?,?)");
		pr.setString(1, tenSP);
		pr.setInt(2, gia);
		pr.setInt(3, maloai);
		pr.executeUpdate();
		pr.close();
	}
	public void updateSP(String tenSP,int gia,int maloai) throws SQLException {
		ArrayList<loai> ar = new ArrayList<loai>();
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=loai;user=DUC;password=123");
		PreparedStatement pr = conn.prepareStatement("UPDATE NhanVien  SET [TenLoai] = ?,[Gia] = ?, [Maloai] = ? WHERE [maloai] = ?");
		pr.setString(1, tenSP);
		pr.setInt(2, gia);
		pr.setInt(3, maloai);
		pr.executeUpdate();
		pr.close();
	}
	public void DeleteDonVi(String MaDV) throws SQLException
	{
		Connection cnt=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=loai;user=DUC;password=123");
		PreparedStatement ps=cnt.prepareStatement("DELETE FROM DonVi]\r\n"
													+ "      WHERE [MaDonVi]=?");
		ps.setString(1, MaDV);
		ps.executeUpdate();
		ps.close();
	}
}
