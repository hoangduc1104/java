package BO;

import java.util.ArrayList;

import BEAN.Sach;
import DAO.SachDAO;

public class SachBO {
	public static SachDAO s = new SachDAO();
	public static ArrayList<Sach> lists = new ArrayList<Sach>() ;
	public ArrayList<Sach> gets () throws Exception{
		lists = s.docsql();
		return lists;
	}
	public void kiemtra() {
		for (Sach sach : lists) {
			if(sach.getGia()<=100000) {
				sach.show();
			}
		}
	}
	
}
