package lop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SinhVien {
	private String masv;
	private String ten;
	private boolean gioiTinh;
	private Date ngaysinh;
	private int khoa;
	private String manganh;
	public String getMasv() {
		return masv;
	}

	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public boolean isGioiTinh() {
		return gioiTinh;
	}


	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}


	public Date getNgaysinh() {
		return ngaysinh;
	}


	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}


	public int getKhoa() {
		return khoa;
	}


	public void setKhoa(int khoa) {
		this.khoa = khoa;
	}


	public String getManganh() {
		return manganh;
	}


	public void setManganh(String manganh) {
		this.manganh = manganh;
	}


	public void setMasv(String masv) {
		this.masv = masv;
	}


	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SinhVien(String masv, String ten, boolean gioiTinh, Date ngaysinh, int khoa, String manganh) {
		super();
		this.masv = masv;
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaysinh = ngaysinh;
		this.khoa = khoa;
		this.manganh = manganh;
	}


	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap masv: ");
		masv = sc.nextLine();
		System.out.print("nhap ten: ");
		ten = sc.nextLine();
		System.out.print("nhap gioi tinh: ");
		String gt = sc.nextLine();
		if(gt == "nam") {
			gioiTinh = true;
		}
		System.out.print("ngay sinh: ");
		String ns = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			ngaysinh = sdf.parse(ns);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.print("nhap khoa: ");
		khoa = sc.nextInt();
		System.out.print("nhap ma nganh: ");
		manganh = sc.nextLine();
	}
	public void showinfor() {
		System.out.println("ma sv:"+masv);
		System.out.println("hoten:"+ten);
		System.out.print("gioitinh :");
		if(gioiTinh) {
			System.out.println("nam");
		}
		else
			System.out.println("nu");
		System.out.println("ngay sinh: "+ ngaysinh);
		System.out.println("khoa: " + khoa);
		System.out.println("ma nganh: "+manganh);
	}
}
