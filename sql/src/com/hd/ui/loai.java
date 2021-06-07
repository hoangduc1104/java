package com.hd.ui;

public class loai {
	private int maloai;
	private String tenloai;
	public int getMaloai() {
		return maloai;
	}
	public void setMaloai(int maloai) {
		this.maloai = maloai;
	}
	public String getTenloai() {
		return tenloai;
	}
	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}
	public loai(int maloai, String tenloai) {
		super();
		this.maloai = maloai;
		this.tenloai = tenloai;
	}
	public loai() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void Show() {
		System.out.print(maloai+"\t"+tenloai);
	}
}
