package bean;

public class SanPham {
	private String maSanPham;
	private String tenSanPham;
	private String donViTinh;
	private Double donGia;
	private int conKinhDoanh;
	private String maLoai;
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}
	public Double getDonGia() {
		return donGia;
	}
	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}
	public int getConKinhDoanh() {
		return conKinhDoanh;
	}
	public void setConKinhDoanh(int conKinhDoanh) {
		this.conKinhDoanh = conKinhDoanh;
	}
	public String getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}
	public SanPham(String maSanPham, String tenSanPham, String donViTinh, Double donGia, int conKinhDoanh,
			String maLoai) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.donViTinh = donViTinh;
		this.donGia = donGia;
		this.conKinhDoanh = conKinhDoanh;
		this.maLoai = maLoai;
	}
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void show() {
//		System.out.println(maSanPham + "\t"+tenSanPham +"\t"+donViTinh +"\t"+donGia +"\t"+conKinhDoanh +"\t"+maLoai );
		 System.out.printf("%-20s %-20s %-20s %-20f %-20d",  maSanPham, tenSanPham,donViTinh, donGia,conKinhDoanh);
	}
}
