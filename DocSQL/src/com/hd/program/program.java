package com.hd.program;

import java.sql.SQLException;
import java.util.ArrayList;

import com.hd.DAO.DonViDao;
import com.hd.DAO.NhanVienDAO;
import com.hd.DAO.coso;
import com.hd.ui.DonVi;
import com.hd.ui.NhanVien;

import Jframe.MENU;
import Jframe.formDonVi;
import Jframe.formNhanVien;
import Jframe.formdn;

public class program {

	public static ArrayList<DonVi> listdv = new ArrayList<DonVi>();
	public static ArrayList<NhanVien> listnv = new ArrayList<NhanVien>();
	public static DonViDao dv = new DonViDao();
	public static NhanVienDAO nv = new NhanVienDAO();
	public static void main(String[] args) throws SQLException {
		
		
		try {
			coso.ketNoi();
			listdv = dv.docsql();
			listnv = nv.docsql();
		} catch (Exception e) {
			// TODO: handle exception
		}
		new MENU().setVisible(true);
	}

}
