package phan2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class BanDo {
	public ArrayList<diem> readfiled(){
		ArrayList<diem> list = new ArrayList<diem>();
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\PC\\Documents\\diem.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null|| line=="")	break;
				String[] tam = line.split(";");
				int a= Integer.parseInt(tam[0]);
				int b = Integer.parseInt(tam[0]);
				diem x = new diem(a,b);
				list.add(x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
