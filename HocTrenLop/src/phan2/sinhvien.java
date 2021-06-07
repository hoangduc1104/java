package phan2;

import java.util.Date;

public class sinhvien {
	private String masv;
	private String hoten;
	private Date ngaysinh;
	private Double dtb;
	private String malop;
	private String pass;
	
	@Override
	public String toString() {
		return "sinhvien [masv=" + masv + ", hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", dtb=" + dtb + ", malop="
				+ malop + ", pass=" + pass + "]";
	}

	public sinhvien() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getMalop() {
		return malop;
	}

	public void setMalop(String malop) {
		this.malop = malop;
	}

	public sinhvien(String masv, String hoten, Date ngaysinh, Double dtb, String malop, String pass) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.dtb = dtb;
		this.malop = malop;
		this.pass = pass;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public Double getDtb() {
		return dtb;
	}
	public void setDtb(Double dtb) {
		this.dtb = dtb;
	}
}
