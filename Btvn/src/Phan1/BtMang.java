package Phan1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class BtMang {
	public String TaoNgay(String Ngay1, String Ngay2) throws ParseException {
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		Date n1 = d.parse(Ngay1);
		Date n2 = d.parse(Ngay2);
		Random r = new Random();
		while(true) {
			long t = r.nextLong();
			if(t>n1.getTime()&&t<n2.getTime()) {
				Date n = new Date(t);
				return d.format(n);
			}
		}
	}
	public String TaoHoTen() {
		String[] ho = {"Hoang ","Nguyen ", "Tran ","Le ", "Dang " };
		String[] lot = {"Van ", "Thi ", "Thanh ","My ", ""};
		String[] ten = {"Nam", "Duc", "Lan","Cuc","Dao","Mai","Son","Hung"};
		Random r = new Random();
		String h= ho[r.nextInt(ho.length)];
		String l = lot[r.nextInt(lot.length)];
		String t = ten[r.nextInt(ten.length)];
		return h+l+t+";";
	}
	public void HienThi(String tf,int n) throws ParseException, IOException {
		Random r = new Random();
//		FileWriter f = new FileWriter(tf);
//		PrintWriter ghi = new PrintWriter(f);
		for(int i=0;i<n;i++) {
			Double dtb = r.nextDouble()*10;
			String[] gioitinh = {"nam", "nu"};
			String g= gioitinh[r.nextInt(gioitinh.length)];
			System.out.print(TaoHoTen()+g+ ";"+dtb+";");
//			ghi.print(TaoHoTen()+g+ ";"+dtb+";");
			System.out.print(TaoNgay("11/12/1000", "12/12/2021")+";");
//			ghi.print(TaoNgay("11/12/1000", "12/12/2021")+";");
			if(dtb>=5) {
				System.out.print("Dau;");
//				ghi.print("Dau;");
			}else {
				System.out.print("rot;");
//				ghi.print("rot;");
			}
			if(dtb>=8) {
				System.out.println("gioi");
//				ghi.println("gioi");
			}else if(dtb>=6.5&&dtb<8) {
				System.out.println("kha");
//				ghi.println("kha");
			}
			else if(dtb>=5&&dtb<6.5) {
				System.out.println("trung binh");
//				ghi.println("trung binh");
			}
			else if(dtb>3&&dtb<5){
				System.out.println("yeu");
//				ghi.println("yeu");
			}
			else {
				System.out.println("kem");
//				ghi.println("kem");
			}
		}//ghi.close();
	}
}
