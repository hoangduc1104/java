package com.hd.ui;

public class DonVi {
	private String maDV;
	private String tenDV;
	public String getMaDV() {
		return maDV;
	}
	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}
	public String getTenDV() {
		return tenDV;
	}
	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}
	public DonVi(String maDV, String tenDV) {
		super();
		this.maDV = maDV;
		this.tenDV = tenDV;
	}
	public DonVi() {
		super();
		// TODO Auto-generated constructor stub
	}
}
