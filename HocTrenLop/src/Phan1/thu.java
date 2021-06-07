package Phan1;

import java.util.Scanner;

public class thu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			GhiFile bt= new GhiFile();
//			bt.TaoFile("dssv.txt", 20);
//			bt.DocFile("dssv.txt");
//			System.out.println("Nhap ten can tim: ");
//			String ten = sc.nextLine();
//			System.out.println("Ket qua tim kiem: ");
//			bt.TimKiem2("dssv.txt", ten);
//			System.out.println(" Da tao File");
			bt.DocFile1("dssv.txt");
//			bt.HienThi();
			bt.Xoa("2");
//			bt.HienThi();
			bt.Sua("1", 9.9);
			bt.Them("21", "hoang duc", 9.9);
			bt.HienThi();
			bt.LuuFile("dssv.txt");
		} catch (Exception e) {
			System.out.println("Loi: " +e.getMessage());
		}

	}

}

//1. xu ly theo kieu con nit(thong bao loi kho bt loi o dau)
//2 xu ly theo kieu quan tu(chi ra loi)
//3. xu ly theo kieu tieu nhan(neu bi loi thi nem loi cho nguoi khac)