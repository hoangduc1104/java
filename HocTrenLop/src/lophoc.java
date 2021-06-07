import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import phan2.sinhvien;

public class lophoc {
	public ArrayList<sinhvien> ds = new ArrayList<sinhvien>();
	public ArrayList<sinhvien> taolop() throws Exception{
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\PC\\Documents\\sinhvien.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null|| line=="")	break;
				String[] tam = line.split(";");
				SimpleDateFormat spd = new SimpleDateFormat("dd/MM/yyyy");
				Date ns = spd.parse(tam[2]);
				sinhvien sv = new sinhvien(tam[0],tam[1],ns,Double.parseDouble(tam[3]),tam[4],tam[5]);
				ds.add(sv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ds;
	}
	public void xuat() {
		for (sinhvien sinhvien : ds) {
			System.out.println(sinhvien.toString());
		}
	}
	public sinhvien ktdn(String masv, String matkhau) {
		for (sinhvien sinhvien : ds) {
			if(sinhvien.getMasv().equalsIgnoreCase(matkhau)&&sinhvien.getPass().equals(matkhau)) {
				return sinhvien;
			}
		}
		return null;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		lophoc a = new lophoc();
		a.taolop();
		a.xuat();
	
	}

}
