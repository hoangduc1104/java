package com.hd.DAO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.hd.model.order;
import com.hd.model.table;
import com.hd.ui.program;

public class bill {

	public void ghifile() {
		 try {
			 BufferedWriter m = new BufferedWriter(new FileWriter(new File("bill.txt")));
//		     FileWriter m = new FileWriter("Outcome.txt");
			 Scanner sc = new Scanner(System.in);
			 System.out.print("nhap ma ban can in bill: ");
			 String mb = sc.nextLine();
		     for (order od : program.listod) {
		    	 if(od.getMaban().equalsIgnoreCase(mb)) {
	//		    	 od.showgia();
			    	 m.write(od.getMaban());
			    	 m.newLine();
					for(int i=0;i<od.getSoluong().size();i++) {
						m.write(od.getTendouong().get(i)+";"+od.getSoluong().get(i)+";"+od.showgia().get(i));
						m.newLine();
					}
					m.write("trong tien:"+od.tongtien());
					m.newLine();
					SimpleDateFormat f= new SimpleDateFormat("MM-dd-yyyy:hh:mm:ss");
					   Date d= new Date();//Lấy ngày hiện tại
					   m.write( f.format(d));
					   m.newLine();
					for (table tb : program.listtb) {
						if(tb.getMaban().equalsIgnoreCase(mb)) {
							tb.setKt(false);
						}
					}
		    	 }
			}
		     m.close();
		    } catch (IOException e) {
		     System.out.println("An error occurred.");
		     e.printStackTrace();
		    }
	}
}
