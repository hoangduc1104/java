package docghifile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Random;

public class ghifile {
	public void TaoFile(String tf,int n) throws IOException {
		String[] ten = {"Nam", "Nga", "Duc"};
		String[] lot = {"van", "thi"};
		String[] ho = {"hoang", "dang", "nguyen"};
		Random r = new Random();
		FileWriter f = new FileWriter(tf);
		PrintWriter ghi = new PrintWriter(f);
		for(int i=0;i<n;i++) {
			String t = ten[r.nextInt(ten.length)];
			String l = lot[r.nextInt(lot.length)];
			String h = ho[r.nextInt(ho.length)];
			String ht = h + " "+ l+" "+ t;
			ghi.println(ht+";");
		}ghi.close();
	}
	public void docfile(String tf) throws IOException {
		FileReader f = new FileReader(tf);
		BufferedReader doc = new BufferedReader(f);
		while(true) {
			String st = doc.readLine();
			if(st==null||st=="")	break;
			System.out.println(st);
		}doc.close();
	}
}
