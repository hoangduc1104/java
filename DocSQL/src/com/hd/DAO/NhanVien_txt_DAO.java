package com.hd.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;

import com.hd.program.program;
import com.hd.ui.NhanVien;

public class NhanVien_txt_DAO {
//	public ArrayList<NhanVien> readfile(){
//		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
//		FileReader fr;
	public void readfile(){
		FileReader fr;
		try {
			fr = new FileReader("D:\\java\\DocSQL\\NhanVien.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null|| line=="")	break;
				String[] tam = line.split(";");
				String a = tam[0]; 
				String b = tam[1];
				Boolean gt = Boolean.parseBoolean(tam[2]);
				String c = gt? "nam":"nu";
				String d =  (tam[3]);
				Float e = Float.parseFloat(tam[4]);
				String f = tam[5];
				String g = tam[6];
				program.nv.insertNhanVien(a, b, c, d, e, f, g);
			}fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
