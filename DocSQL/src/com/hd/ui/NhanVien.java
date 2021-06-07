package com.hd.ui;

import java.util.Date;

public class NhanVien {
	private String MaNV;
	private String TenNV;
	private String GioiTinh;
	private Date NgaySinh;
	private Float HeSoLuong;
	private String MaDV;
	private String Pass;
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getTenNV() {
		return TenNV;
	}
	public void setTenNV(String tenNV) {
		TenNV = tenNV;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public Date getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public Float getHeSoLuong() {
		return HeSoLuong;
	}
	public void setHeSoLuong(Float heSoLuong) {
		HeSoLuong = heSoLuong;
	}
	public String getMaDV() {
		return MaDV;
	}
	public void setMaDV(String maDV) {
		MaDV = maDV;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public NhanVien(String maNV, String tenNV, String gioiTinh, Date ngaySinh, Float heSoLuong, String maDV,
			String pass) {
		super();
		MaNV = maNV;
		TenNV = tenNV;
		GioiTinh = gioiTinh;
		NgaySinh = ngaySinh;
		HeSoLuong = heSoLuong;
		MaDV = maDV;
		Pass = pass;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
