package com.hd.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.hd.model.table;


public class tableDAO {
	public ArrayList<table> readfilet(){
		ArrayList<table> list = new ArrayList<table>();
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\PC\\Downloads\\Tables.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null|| line=="")	break;
				String[] tam = line.split(";");
				String b = tam[0];
				boolean c = tam[1].equalsIgnoreCase("true");
				table x = new table(b,c);
				list.add(x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
