package com.hd.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.hd.model.diem;
import com.hd.model.sinhvien;

public class diemsvDAO {
	public ArrayList<diem> readfilendt(){
		ArrayList<diem> list = new ArrayList<diem>();
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\PC\\Documents\\diem.sv.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null|| line=="")	break;
				String[] tam = line.split(";");
				int a = Integer.parseInt(tam[0]);
				double[] b = new double[3]; 
				for (int i=0;i<3;i++) {
					b[i]=Double.parseDouble(tam[i+1]);
				}
				diem x = new diem(a, b);
				list.add(x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
