package Phan1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class btFile {
	public void taoDanhSach(int n) throws FileNotFoundException {
		try {
			FileOutputStream f = new FileOutputStream("sv.txt");
			OutputStreamWriter o = new OutputStreamWriter(f);
			PrintWriter ghi = new PrintWriter(o);
			Random r =new Random();
			BtMang m = new BtMang();
			for(int i=0;i<n;i++) {
				Double dtb = r.nextDouble()*10;
				String[] gioitinh = {"nam", "nu"};
				String g= gioitinh[r.nextInt(gioitinh.length)];
//				System.out.print(TaoHoTen()+g+ ";"+dtb+";");
				ghi.print(m.TaoHoTen()+g+ ";"+dtb+";");
//				System.out.print(TaoNgay("11/12/1000", "12/12/2021")+";");
				ghi.print(m.TaoNgay("11/12/1000", "12/12/2021")+";");
				if(dtb>=5) {
//					System.out.print("Dau;");
					ghi.print("Dau;");
				}else {
//					System.out.print("rot;");
					ghi.print("rot;");
				}
				if(dtb>=8) {
//					System.out.println("gioi");
					ghi.println("gioi");
				}else if(dtb>=6.5&&dtb<8) {
//					System.out.println("kha");
					ghi.println("kha");
				}
				else if(dtb>=5&&dtb<6.5) {
//					System.out.println("trung binh");
					ghi.println("trung binh");
				}
				else if(dtb>3&&dtb<5){
//					System.out.println("yeu");
					ghi.println("yeu");
				}
				else {
//					System.out.println("kem");
					ghi.println("kem");
				}
			}ghi.close();
			System.out.print("da tao xong");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("loi o ham tao ds" + e.getMessage());
		}
		
	}
	public void docDanhSach() throws FileNotFoundException{
		try {
			FileInputStream f = new FileInputStream("sv.txt");
			InputStreamReader ir = new InputStreamReader(f);
			BufferedReader doc = new BufferedReader(ir);
			while(true) {
				String st = doc.readLine();
				if(st == null||st=="") 	break;
				String[] ds = st.split("[;]");
				System.out.println(ds[0]);
				System.out.println(ds[1]);
				System.out.println(ds[2]);
				System.out.println(ds[3]);
				System.out.println(ds[4]);
				System.out.println(ds[5]);
				System.out.println("--------------------------");
			}
			doc.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("loi o ham doc danh sach" + e.getMessage());
		}
	}
	public void TimKiemTheoTen() throws IOException {
		FileInputStream f = new FileInputStream("sv.txt");
		InputStreamReader ir = new InputStreamReader(f);
		BufferedReader doc = new BufferedReader(ir);
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten can tim:");
		String Tencantim = sc.nextLine();
		while(true) {
			String st = doc.readLine();
			if(st == null||st=="") 	break;
			String[] ds = st.split("[;]");
			if(Tencantim.equalsIgnoreCase(ds[0])) {
				System.out.println(ds[0]);
				System.out.println(ds[1]);
				System.out.println(ds[2]);
				System.out.println(ds[3]);
				System.out.println(ds[4]);
				System.out.println(ds[5]);
				System.out.println("--------------------------");
			}
		}
	}
	public void SosvDau() throws IOException {
		FileInputStream f = new FileInputStream("sv.txt");
		InputStreamReader ir = new InputStreamReader(f);
		BufferedReader doc = new BufferedReader(ir);
		int dem =0;
		while(true) {
			String st = doc.readLine();
			if(st == null||st=="") 	break;
			String[] ds = st.split("[;]");
			if(Float.parseFloat(ds[2]) >= 5) {
				dem++;
			}
		}
		System.out.println("so sinh vien dau la: "+ dem);
	}
	public void SosvRot() throws IOException {
		FileInputStream f = new FileInputStream("sv.txt");
		InputStreamReader ir = new InputStreamReader(f);
		BufferedReader doc = new BufferedReader(ir);
		int dem =0;
		while(true) {
			String st = doc.readLine();
			if(st == null||st=="") 	break;
			String[] ds = st.split("[;]");
			if(Float.parseFloat(ds[2]) < 5) {
				dem++;
			}
		}
		System.out.println("so sinh vien rot la: "+ dem);
	}
	public void trungbinhcong() throws IOException {
		FileInputStream f = new FileInputStream("sv.txt");
		InputStreamReader ir = new InputStreamReader(f);
		BufferedReader doc = new BufferedReader(ir);
		float t=0;
		int dem=0;
		while(true) {
			String st = doc.readLine();
			if(st == null||st=="") 	break;
			String[] ds = st.split("[;]");
			t+= Float.parseFloat(ds[2]);
			dem++;
		}
		System.out.println("trung binh cong la: "+ t/dem);
		System.out.println("tong la: "+ t+"\t"+dem);
	}
}
