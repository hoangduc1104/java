package bo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import bean.SanPham;


public class docfiletxt_DAO {
	public static ArrayList<SanPham> ds = new ArrayList<SanPham>();
	public ArrayList<SanPham> readfile(){
		FileReader fr;
		try {
			fr = new FileReader("D:\\java\\thithu\\sanpham.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null|| line=="")	break;
				String[] tam = line.split("\\|");
				String a = tam[0]; 
				String b = tam[1];
				String c = tam[2];
				Double d =  Double.parseDouble(tam[3]);
				int e = Integer.parseInt(tam[4]);
				String f = tam[5];
				ds.add(new SanPham(a,b,c,d,e,f));
			}fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ds;
	}
}
