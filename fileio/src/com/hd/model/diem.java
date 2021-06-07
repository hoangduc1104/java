package com.hd.model;

public class diem {
	private int masv;
	private double[] diem;
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public double[] getDiem() {
		return diem;
	}
	public void setDiem(double[] diem) {
		this.diem = diem;
	}
	public diem(int masv, double[] diem) {
		super();
		this.masv = masv;
		this.diem = diem;
	}
	public double diemtb() {
		double t=0;
		for (double d : diem) {
			t+=d;
		}
		double roundOff = Math.round(t/diem.length * 100.0) / 100.0;
		return roundOff;
	}
	public void show() {
		System.out.print("masv la: "+ masv+"\n");
		System.out.print("diem toan ly hoa lan luot la: ");
		for(int i=0;i<3;i++) {
			System.out.print(diem[i]+"\t");
		}
	}
	public String xeploai() {
		double x = diemtb();
		String xl;
		if(x>=9) {
			xl = "xuat sac";
		}
		else if(x<9&&x>=8) {
			xl="gioi";
		}
		else if(x<8&&x>=7) {
			xl = "kha";
		}
		else if(x<7&&x>=5) {
			xl = "trung binh";
		}
		else if(x<5&&x>=3.5) {
			xl = "yeu";
		}
		else {
			xl = "kem";
		}
		return xl;
	}
}
