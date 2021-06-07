package bo;

import java.sql.SQLException;
import java.util.ArrayList;
import DAO.SanPham_DAO;
import bean.SanPham;

public class SanPham_BO {
	public static SanPham_DAO sp = new SanPham_DAO();
	public static ArrayList<SanPham> listsp = new ArrayList<SanPham>() ;
	public ArrayList<SanPham> getsp () throws Exception{
		listsp = sp.docsql();
		return listsp;
	}
	public void kiemtra() throws SQLException {
		for (SanPham l : docfiletxt_DAO.ds) {
			Boolean temp = false;
			for (SanPham s : listsp) {
				if(l.getMaSanPham().equalsIgnoreCase(s.getMaSanPham())) {
					temp = true;
				}
				
			}
			if(!temp) {
				sp.insertSanPham(l.getMaSanPham(), l.getTenSanPham(), l.getDonViTinh(), l.getDonGia(), l.getConKinhDoanh(), l.getMaLoai());
				listsp = sp.docsql();
			}
			if(temp) {
				sp.updateSP(l.getMaSanPham(), l.getTenSanPham(), l.getDonViTinh(), l.getDonGia(), l.getConKinhDoanh(), l.getMaLoai());
				listsp = sp.docsql();
			}
		}
	}
}
