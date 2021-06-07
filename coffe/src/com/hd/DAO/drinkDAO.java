package com.hd.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.hd.model.drinks;
import com.hd.model.table;

public class drinkDAO {
	public ArrayList<drinks> readfiled(){
		ArrayList<drinks> list = new ArrayList<drinks>();
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\PC\\Downloads\\Drinks.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null|| line=="")	break;
				String[] tam = line.split(";");
				int a= Integer.parseInt(tam[0]);
				String b =tam[1];
				long c = Long.parseLong(tam[2]);
				drinks x = new drinks(a,b,c);
				list.add(x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
