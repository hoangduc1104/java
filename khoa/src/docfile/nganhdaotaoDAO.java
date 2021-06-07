package docfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import lop.NganhDaoTao;

public class nganhdaotaoDAO {
	public ArrayList<NganhDaoTao> readfilendt(){
		ArrayList<NganhDaoTao> list = new ArrayList<NganhDaoTao>();
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\PC\\Downloads\\nganhdaotao.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null|| line=="")	break;
				String[] tam = line.split(";");
				String a = tam[0];
				String b = tam[1];
				NganhDaoTao x = new NganhDaoTao(a, b);
				list.add(x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
