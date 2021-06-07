package chay;

import java.io.IOException;

import docghifile.ghifile;

public class run {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			ghifile s = new ghifile();
	//		s.TaoFile("hoangduc.txt", 50);
			s.docfile("hoangduc.txt");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("loi" + e.getMessage());
		}
	}

}
