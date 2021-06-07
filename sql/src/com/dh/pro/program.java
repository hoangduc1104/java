package com.dh.pro;

import java.sql.SQLException;
import java.util.ArrayList;

import com.hd.DAO.LoaiDAO;
import com.hd.DAO.sanphamDAO;
import com.hd.ui.loai;
import com.hd.ui.sanPham;

public class program {
	public static LoaiDAO l = new LoaiDAO();
	public static sanphamDAO sp = new sanphamDAO();
	public static ArrayList<loai> listl = new ArrayList<loai>();
	public static ArrayList<sanPham> listsp = new ArrayList<sanPham>();
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		listl = l.docsql();
		listsp = sp.docsql();
		for (sanPham sp : listsp) {
			sp.Show();
		}
		l.insertLoai("Apple");
		l.updateLoai("TiVi",7);
	}

}
