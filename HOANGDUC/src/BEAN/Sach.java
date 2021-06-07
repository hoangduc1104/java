package BEAN;

public class Sach {
	private String maSach;
	private String tenSach;
	private String tacGia;
	private Double gia;
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public Double getGia() {
		return gia;
	}
	public void setGia(Double gia) {
		this.gia = gia;
	}
	public Sach(String maSach, String tenSach, String tacGia, Double gia) {
		super();
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.tacGia = tacGia;
		this.gia = gia;
	}
	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void show() {
		 System.out.printf("%-20s %-20s %-20s %-20f %n",  maSach, tenSach,tacGia, gia);
	}
}
