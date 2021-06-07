package com.hd.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.hd.ui.loai;
import com.hd.ui.sanPham;

public class LoaiDAO {
	public ArrayList<loai> docsql() throws SQLException{
		ArrayList<loai> ar = new ArrayList<loai>();
		Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=sanPham;user=DUC;password=123");
		Statement st = cn.createStatement();
		ResultSet r = st.executeQuery("SELECT * FROM Loai");
		
		while(r.next()) {
			int mal = r.getInt(1);
			String tenl = r.getString(2);
			loai l = new loai(mal,tenl);
			ar.add(l);
		}
		return ar;	
	}
	public void insertLoai(String tenloai) throws SQLException {
		ArrayList<loai> ar = new ArrayList<loai>();
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=sanPham;user=DUC;password=123");
		PreparedStatement pr = conn.prepareStatement("INSERT INTO Loai([TenLoai])"+ "VALUES(?)");
		pr.setString(1, tenloai);
		pr.executeUpdate();
		pr.close();
	}
	public void updateLoai(String tenloai,int maloai) throws SQLException {
		ArrayList<loai> ar = new ArrayList<loai>();
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=sanPham;user=DUC;password=123");
		PreparedStatement pr = conn.prepareStatement("UPDATE Loai  SET [TenLoai] = ? WHERE [maloai] = ?");
		pr.setString(1, tenloai);
		pr.setInt(2, maloai);
		pr.executeUpdate();
		pr.close();
	}
}
