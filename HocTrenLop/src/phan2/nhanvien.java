package phan2;

public class nhanvien extends nguoi {
	private String manv;
	private Double hsl;
	public nhanvien(String hoten, int tuoi, String manv, Double hsl) {
		super(hoten, tuoi);
		this.manv = manv;
		this.hsl = hsl;
	}
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	public Double getHsl() {
		return hsl;
	}
	public void setHsl(Double hsl) {
		this.hsl = hsl;
	}
	
}
