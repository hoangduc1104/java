package com.hd.ui;

public class sanPham {
	private int masp;
	private String tensp;
	private int gia;
	public int getMasp() {
		return masp;
	}
	public void setMasp(int masp) {
		this.masp = masp;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public sanPham(int masp, String tesp, int gia) {
		super();
		this.masp = masp;
		this.tensp = tesp;
		this.gia = gia;
	}
	public sanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void Show() {
		System.out.print(masp+"\t"+tensp+"\t"+gia);
	}
}
