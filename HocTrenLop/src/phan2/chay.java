package phan2;

import java.util.ArrayList;

public class chay { 
	public static BanDo s = new BanDo();
	public static ArrayList<diem> d = new ArrayList<diem>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (diem n : s.readfiled()) {
			n.xuat();
		}
	}

}
