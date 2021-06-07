public class Writefile {
	public void writeFile(String masv,String name,Date ns,Double dtb) throws ParseException {
		FileWriter fw;
		try {
			fw = new FileWriter("D:\\Java\\SinhVien\\SinhVien.txt");
		PrintWriter pr=new PrintWriter(fw);
		for (SinhVien sv : DangNhap.List) {
			pr.println(sv.getMaSV()+";"+sv.getHoten()+";"+sv.getNgaySinh()+";"+sv.getDtb()+";"+sv.getMalop()+";"+sv.getMatKhau());
		}
		SinhVien sv = new SinhVien(masv, name, ns, dtb, "CNTT", "123456");
		DangNhap.List.add(sv);
		pr.println(masv+";"+name+";"+ns+";"+dtb+";"+"CNTT"+";"+"123456");
		pr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void writeFile2(String name) throws ParseException {
		FileWriter fw;
		try {
			fw = new FileWriter("D:\\Java\\SinhVien\\SinhVien.txt");
		PrintWriter pr=new PrintWriter(fw);
			for(int i=0;i<DangNhap.List.size();i++)
			{
				SinhVien sv=DangNhap.List.get(i);
				if(sv.getHoten().contains(name))
				{
					DangNhap.List.remove(i);
					break;
				}
			}
		for (SinhVien sv : DangNhap.List) {
				pr.println(sv.getMaSV()+";"+sv.getHoten()+";"+sv.getNgaySinh()+";"+sv.getDtb()+";"+sv.getMalop()+";"+sv.getMatKhau());
		}
		pr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Update(String masv,String name,Date ns, Double dtb) throws ParseException {
		FileWriter fw;
		try {
			fw = new FileWriter("D:\\Java\\SinhVien\\SinhVien.txt");
		PrintWriter pr=new PrintWriter(fw);
		for (SinhVien sv1 : DangNhap.List) {
			if(masv.equals(sv1.getMaSV()))
			{
				sv1.setMaSV(masv);
				sv1.setHoten(name);
				sv1.setNgaySinh(ns);
				sv1.setDtb(dtb);
			}	
		}
		for (SinhVien sv : DangNhap.List) {
				pr.println(sv.getMaSV()+";"+sv.getHoten()+";"+sv.getNgaySinh()+";"+sv.getDtb()+";"+sv.getMalop()+";"+sv.getMatKhau());
		}
		pr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}