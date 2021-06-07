package com.hd.model;

public class sinhvien {
	private int masv;
	private String hoTen;
	private boolean gioitinh;
	private String lop;
	public sinhvien(int masv, String hoTen, boolean gioitinh, String lop) {
		super();
		this.masv = masv;
		this.hoTen = hoTen;
		this.gioitinh = gioitinh;
		this.lop = lop;
	}
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String isGioitinh() {
		return gioitinh ? "nam" : "nu";
	}
	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public void show() {
		System.out.println("ma sv la: "+masv);
		System.out.println("hoten: "+hoTen);
		System.out.print("gioi tinh: ");
		System.out.println(gioitinh ? "nam" : "nu");
		System.out.println("lop: "+lop);
	}
	
}
