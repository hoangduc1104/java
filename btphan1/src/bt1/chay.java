package bt1;

import java.util.ArrayList;
import java.util.Scanner;

public class chay {
	ArrayList<docfile> df = new ArrayList<docfile>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
				
		try {
			docfile bt= new docfile();
			bt.DocFile1("hang.txt");
//			bt.HienThi();
//			bt.thanhtien();
			bt.timkiem();
		} catch (Exception e) {
			System.out.println("Loi: " +e.getMessage());
		}

	}

}
