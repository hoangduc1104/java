package com.hd.DAO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.hd.model.order;
import com.hd.ui.program;

public class orderDAO {
	public void ghifile() {
		 try {
			 BufferedWriter m = new BufferedWriter(new FileWriter(new File("order.txt")));
//		     FileWriter m = new FileWriter("Outcome.txt");
		     for (order od : program.listod) {
		    	 m.write(od.getMaban());
		    	 m.newLine();
				for(int i=0;i<od.getSoluong().size();i++) {
					m.write(od.getTendouong().get(i)+";"+od.getSoluong().get(i));
					m.newLine();
		
				}
			}
		     m.close();
		    } catch (IOException e) {
		     System.out.println("An error occurred.");
		     e.printStackTrace();
		    }
	}
}
