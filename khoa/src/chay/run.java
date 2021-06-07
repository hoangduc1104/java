package chay;

import java.util.ArrayList;
import java.util.Scanner;

import docfile.nganhdaotaoDAO;
import docfile.sinhvienDAO;
import lop.NganhDaoTao;
import lop.SinhVien;

public class run {
	public static ArrayList<NganhDaoTao> listndt = new ArrayList<NganhDaoTao>();
	public static ArrayList<SinhVien> listsv = new ArrayList<SinhVien>();
	public static nganhdaotaoDAO ndt = new nganhdaotaoDAO();
	public static sinhvienDAO sv = new sinhvienDAO();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listsv = sv.readfilesv();
		listndt = ndt.readfilendt();
		SinhVien x = new SinhVien();
		x.Input();
//		menu();
	}
//	public static void menu() {
//		System.out.println("1. nhap 1 de them sv.");
//		System.out.println("2. nhap 2 de tim kiem.");
//		System.out.println("3. nhap 3 de show.");
//		System.out.println("4. nhap 4 de update.");
//		System.out.println("---------------------------");
//		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt();
//		choose(n);
//	}
//	public static void choose(int n) {
//		switch (n) {
//		case 1: 
//			System.out.println("nhap thong tin sv can them.");
//			SinhVien x = new SinhVien();
//			x.Input();
//			listsv.add(x);
//			break;
//		case 2:
//			String msv;
//			Scanner sc =new Scanner(System.in);
//			System.out.println("nhap ma sinh vien can tin kiem: ");
//			msv = sc.nextLine();
//			int dem =0;
//			for (SinhVien sinhvien : listsv) {
//				if(sinhvien.getMasv().equalsIgnoreCase(msv)) {
//					sinhvien.showinfor();
//					for (NganhDaoTao nganhDaoTao : listndt) {
//						if(sinhvien.getManganh().equalsIgnoreCase(nganhDaoTao.getMaNganh())){
//							System.out.println(nganhDaoTao.getTenNganh());
//						}
//					}
//				}else {
//					dem++;
//				}
//			}
//			if(dem == listsv.size()) {
//				System.out.println("khong co sv ma ban can tim");
//			}
//			break;
//		case 3:
//			for (SinhVien sinhvien : listsv) {
//					sinhvien.showinfor();
//					for (NganhDaoTao nganhDaoTao : listndt) {
//						if(sinhvien.getManganh().equalsIgnoreCase(nganhDaoTao.getMaNganh())){
//							System.out.print(nganhDaoTao.getTenNganh());
//						}
//					}
//			}
//			break;
//		case 4:
//			String masv;
//			Scanner sr = new Scanner(System.in);
//			System.out.println("nhap ma sinh vien can update: ");
//			masv= sr.nextLine();
//			for (SinhVien sinhVien : listsv) {
//				if(sinhVien.getMasv().equalsIgnoreCase(masv)) {
//					sinhVien.Input();
//				}
//			}
//			break;
//		case 0:
//			System.exit(0);
//		}
//			
//		menu();
//	}
}
