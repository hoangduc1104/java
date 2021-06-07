package com.hd.ui;

import java.util.ArrayList;

import com.hd.DAO.datasvDAO;
import com.hd.DAO.diemsvDAO;
import com.hd.DAO.ketquaDAO;
import com.hd.model.*;
public class program {
	public static diemsvDAO  d = new diemsvDAO();
	public static datasvDAO dt = new datasvDAO();
	public static ArrayList<diem> listd = new ArrayList<diem>();
	public static ArrayList<sinhvien> listdt = new ArrayList<sinhvien>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	listdt = dt.readfilendt();
	listd = d.readfilendt();
	ketquaDAO f = new ketquaDAO();
	f.ghifile();
	}
}
