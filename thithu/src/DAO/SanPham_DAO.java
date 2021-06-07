package DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.SanPham;


public class SanPham_DAO {
	public ArrayList<SanPham> docsql() throws SQLException{
		ArrayList<SanPham> arr = new ArrayList<SanPham>();
		Statement st = coso.conn.createStatement();
		ResultSet r = st.executeQuery("SELECT * FROM SanPham");
		
		while(r.next()) {
			String msp = r.getString(1);
			String tsp = r.getString(2);
			String dvt = r.getString(3);
			Double dg = r.getDouble(4);
			int ckd = r.getInt(5);
			String ml = r.getString(6);
			SanPham sp = new SanPham(msp,tsp,dvt,dg,ckd,ml);
			arr.add(sp);
		}
		return arr;
	}
	public void insertSanPham(String ma,String ten,String dvt,Double dg, int ckd, String ml ) throws SQLException {
		ArrayList<SanPham> ar = new ArrayList<SanPham>();
		PreparedStatement pr = coso.conn.prepareStatement("INSERT INTO SanPham([maSanPham],[tenSanPham],[donViTinh],[DonGia],[conKinhDoanh],[maLoai])"+ "VALUES(?,?,?,?,?,?)");
		pr.setString(1, ma);
		pr.setString(2, ten);
		pr.setString(3,dvt );
		pr.setDouble(4, dg);
		pr.setInt(5, ckd);
		pr.setString(6, ml);
		pr.executeUpdate();
		pr.close();
	}
	public void updateSP(String ma,String ten,String dvt,Double dg, int ckd, String ml) throws SQLException {
		ArrayList<SanPham> ar = new ArrayList<SanPham>();
		PreparedStatement pr = coso.conn.prepareStatement("UPDATE SanPham set [tenSanPham]=?,[donViTinh]=?,[DonGia]=?,[conKinhDoanh]=?,[maLoai]=? where [maSanPham]=?");
		pr.setString(1, ten);
		pr.setString(2, dvt);
		pr.setDouble(3, dg);
		pr.setInt(4, ckd);
		pr.setString(5, ml);
		pr.setString(6, ma);
		pr.executeUpdate();
		pr.close();
	}
//	public void DeleteNhanVien(String MaNV) throws SQLException
//	{
//		PreparedStatement ps=coso.conn.prepareStatement("DELETE FROM NhanVien"
//													+ "      WHERE [TenNhanVien]=?");
//		ps.setString(1, MaNV);
//		ps.executeUpdate();
//		ps.close();
//	}
}
