package com.hd.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.hd.model.diem;
import com.hd.model.sinhvien;

public class datasvDAO {
	public ArrayList<sinhvien> readfilendt(){
		ArrayList<sinhvien> list = new ArrayList<sinhvien>();
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\PC\\Documents\\datasv.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null|| line=="")	break;
				String[] tam = line.split(";");
				int a = Integer.parseInt(tam[0]);
				String b = tam[1];
				boolean c =tam[2].equalsIgnoreCase("true");
				String d = tam[3];
				sinhvien x = new sinhvien(a, b,c,d);
				list.add(x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
