package phan2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class lophoc2 {
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
			if(sinhvien.getMasv().equalsIgnoreCase(masv)&&sinhvien.getPass().equals(matkhau)) {
				return sinhvien;
			}
		}
		return null;
	}
//	public void them() throws ParseException {
//		Scanner sc = new Scanner(System.in);
//		String msv = sc.nextLine();
//		String ht = sc.nextLine();
//		String d=sc.nextLine();
//		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");		
//		Date n = f.parse(d);
//		Double diem = Double.parseDouble(sc.nextLine());
//		String ml = sc.nextLine();
//		String p = sc.nextLine();
//		sinhvien sv = new sinhvien(msv, ht, n, diem, ml, p);
//		FileWriter fw;
//		try {
//			fw = new FileWriter("C:\\Users\\PC\\Documents\\sinhvien.txt");
//		PrintWriter pr=new PrintWriter(fw);
//		for (sinhsien sv1 : DangNhap.List) {
//			if(masv.equals(sv1.getMaSV()))
//			{
//				sv1.setMaSV(masv);
//				sv1.setHoten(name);
//				sv1.setNgaySinh(ns);
//				sv1.setDtb(dtb);
//			}	
//		}
//		for (SinhVien sv : DangNhap.List) {
//				pr.println(sv.getMaSV()+";"+sv.getHoten()+";"+sv.getNgaySinh()+";"+sv.getDtb()+";"+sv.getMalop()+";"+sv.getMatKhau());
//		}
//		pr.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	public void writeFile2(String name) throws ParseException {
		FileWriter fw;
		try {
			fw = new FileWriter("C:\\Users\\PC\\Documents\\sinhvien.txt");
		PrintWriter pr=new PrintWriter(fw);
			for(int i=0;i<ds.size();i++)
			{
				sinhvien sv= ds.get(i);
				if(sv.getHoten().contains(name))
				{
					ds.remove(i);
					break;
				}
			}
		for (sinhvien sv : ds) {
				pr.println(sv.getMasv()+";"+sv.getHoten()+";"+sv.getNgaysinh()+";"+sv.getDtb()+";"+sv.getMalop()+";"+sv.getPass());
		}
		pr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
