package com.hd.DAO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.hd.model.diem;
import com.hd.model.sinhvien;
import com.hd.ui.program;

public class ketquaDAO {
	public void ghifile() {
		 try {
			  BufferedWriter m = new BufferedWriter(new FileWriter(new File("Outcome.txt")));
//		      FileWriter m = new FileWriter("Outcome.txt");
		      for (sinhvien sv : program.listdt) {
				for (diem d : program.listd) {
					if(sv.getMasv()==d.getMasv()) {
						m.write(sv.getMasv()+";"+sv.getHoTen()+";"+sv.getLop()+";"+sv.isGioitinh()+";"+d.diemtb()+";"+d.xeploai());
						m.newLine();
					}
				}
			}
		      m.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}
