package lop;

import java.io.FileInputStream;

public class NganhDaoTao {
	String maNganh;
	String TenNganh;
	public String getMaNganh() {
		return maNganh;
	}
	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}
	public String getTenNganh() {
		return TenNganh;
	}
	public void setTenNganh(String tenNganh) {
		TenNganh = tenNganh;
	}
	public NganhDaoTao(String maNganh, String tenNganh) {
		super();
		this.maNganh = maNganh;
		TenNganh = tenNganh;
	}
	public void showinfo() {
		System.out.println("ten nganh:"+TenNganh);
	}
}
