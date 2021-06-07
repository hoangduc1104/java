package docfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import lop.SinhVien;

public class sinhvienDAO {
	public ArrayList<SinhVien> readfilesv(){
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\PC\\Downloads\\sinhvien.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null|| line=="")	break;
				String[] tam = line.split("[;]");
				String a = tam[0];
				String b = tam[1];
				boolean c = tam[2].equals("True");
				Date d =null;
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				try {
					d = sdf.parse(tam[3]);
				} catch (Exception e) {
					// TODO: handle exception
				}
				int e = Integer.parseInt(tam[4]);
				String f = tam[5];
				SinhVien x = new SinhVien(a,b,c,d,e,f);
				list.add(x);
			}br.close();
		} catch (Exception e) {
			System.out.print("loi o lop sinhvienDAO" +e.getMessage());
		}
		return list;
	}
}
