package view;

import DAO.Loai_DAO;
import DAO.coso;
import bean.Loai;
import bean.SanPham;
import bo.Loai_BO;
import bo.SanPham_BO;
import bo.docfiletxt_DAO;

public class program {

	public static void main(String[] args) {
		try {
			coso.ketNoi();
			SanPham_BO n = new SanPham_BO();
			docfiletxt_DAO df= new docfiletxt_DAO();
			Loai_BO lbo = new Loai_BO();
			lbo.getl();
			df.readfile();
			n.getsp();
			n.kiemtra();
			System.out.printf("%-20s %-20s %-20s %-20s %-20s %s%n",  "maSanPham", "tenSanPham","donViTinh", "donGia","conKinhDoanh","TenLoai");
			for (SanPham string : SanPham_BO.listsp) {
				string.show();
				for (Loai string2 : Loai_BO.listl) {
					if(string.getMaLoai().equals(string2.getMaLoai())) {
						string2.show();
					}
				}
			}
//			for (SanPham string : docfiletxt_DAO.ds) {
//				string.show();
//			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
