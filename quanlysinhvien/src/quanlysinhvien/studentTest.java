package quanlysinhvien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class studentTest {
	public static ArrayList<student> list = new ArrayList<student>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}
	public static void menu() {
		System.out.println("1. Nhap vao N sinh vien: ");
		System.out.println("2. Hien thi thong tin sinh vien");
		System.out.println("3. Hien thi max va min theo dtb");
		System.out.println("4. Tim kiem sinh vien theo ma sv");
		System.out.println("5. sap xep theo ten roi xuat dssv");
		System.out.println("6. Hien thi sinh vien duoc hoc bong va sap xep diem giam dan");
		System.out.println("7. Nhan 0 de thoat");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Nhap lua chon: ");
		Scanner sc = new Scanner(System.in);
		int m= sc.nextInt();
		choose(m);
	}
	static public void choose(int m) {
		switch (m) {
		case 1: 
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap vao so sinh vien n:  ");
			n = sc.nextInt();
			for(int i=0;i<n;i++) {
				student s = new student();
				s.inputInfo();
				list.add(s);
			}
			break;
		case 2:
			for (student student : list) {
				student.showInfo();
			}
			break;
		case 3:
			int minIndex = 0, maxIndex =0;
			float min, max;
			min = list.get(0).getMark();
			max = list.get(0).getMark();
			for (int i=1;i<list.size();i++) {
				if(list.get(i).getMark()<min) {
					minIndex = i;
					min = list.get(i).getMark()	;	
				}
				if(list.get(i).getMark()> max) {
					maxIndex = i;
					max = list.get(i).getMark();
				}
			}
			System.out.println("Sinh vien co diem cao nhat la: ");
			list.get(maxIndex).showInfo();
			System.out.println("Sinh vien co diem thap nhat la: ");
			list.get(minIndex).showInfo();
			break;
		case 4:
			Scanner cs = new Scanner(System.in);
			System.out.println("Nhap ten sinh vien can tim: ");
			String searchMsv = cs.nextLine();
			int dem =0;
			for (student student : list) {
				if(student.getRollNo().equalsIgnoreCase(searchMsv)) {
					student.showInfo();
					dem++;
				}
			}
			if(dem==0) {
				System.out.println("khong co sinh vien ban can tim!");
			}
			break;
		case 5:
			Collections.sort(list, new Comparator<student>() {

				@Override
				public int compare(student o1, student o2) {
					// TODO Auto-generated method stub
					int cmp = o1.getName().compareTo(o2.getName());
					if(cmp >= 0) {
						return 1;
					}
					return -1;
				}
			});
			for (int i = 0; i < list.size(); i++) {
				list.get(i).showInfo();
			}
			break;
		case 6: 
			Collections.sort(list, new Comparator<student>() {

				@Override
				public int compare(student o1, student o2) {
					return o1.getMark() >= o2.getMark()?-1:1;
				}
				
			});
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).checkhocbong()) {
					list.get(i).showInfo();
				}
			}
			break;
		case 7:
			System.exit(0);
		}
	menu();
	}
}
