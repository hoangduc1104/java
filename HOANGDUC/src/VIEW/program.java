package VIEW;

import BEAN.Sach;
import BO.SachBO;
import DAO.coso;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			coso.ketNoi();
			SachBO n = new SachBO();
			n.gets();

			System.out.printf("%-20s %-20s %-20s %-20s%n",  "maSach", "tenSach","tacGia", "Gia");
			for (Sach string : SachBO.lists) {
				string.show();
			}
			System.out.println("-------------------------------------------------------------------------------");
//			for (Sach string : SachBO.lists) {
//				if(string.getGia()<=100000) {
//					string.show();
//				}
//			}
			n.kiemtra();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
